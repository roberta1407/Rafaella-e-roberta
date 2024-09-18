ne:
            parent_session = sessions.get(self.pid)
        if parent_session is None:
            log.info("No active debug session for parent process of {0}.", self)
        else:
            if self.pid == parent_session.pid:
                parent_server = parent_session.server
                if not (parent_server and parent_server.connection.process_replaced):
                    log.error("{0} is not expecting replacement.", parent_session)
                    self.channel.close()
                    return
            try:
                parent_session.client.notify_of_subprocess(self)
                return
            except Exception:
                # This might fail if the client concurrently disconnects from the parent
                # session. We still want to keep the connection around, in case the
                # client reconnects later. If the parent session was "launch", it'll take
                # care of closing the remaining server connections.
                log.swallow_exception(
                    "Failed to notify parent session about {0}:", self
                )

        # If we got to this point, the subprocess notification was either not sent,
        # or not delivered successfully. For the first server, this is expected, since
        # it corresponds to the root process, and there is no other debug session to
        # notify. But subsequent server connections represent subprocesses, and those
        # will not start running user code until the client tells them to. Since there
        # isn't going to be a client without the notification, such subprocesses have
        # to be unblocked.
        if is_first_server:
            return
        log.info("No clients to wait for - unblocking {0}.", self)
        try:
            self.channel.request("initialize", {"adapterID": "debugpy"})
            self.channel.request("attach", {"subProcessId": self.pid})
            self.channel.request("configurationDone")
            self.channel.request("disconnect")
        except Exception:
            log.swallow_exception("Failed to unblock orphaned subprocess:")
            self.channel.close()

    def __str__(self):
        return "Server" + ("[?]" if self.pid is None else f"[pid={self.pid}]")

    def authenticate(self):
        if access_token is None and adapter.access_token is None:
            return
        auth = self.channel.request(
            "pydevdAuthorize", {"debugServerAccessToken": access_token}
        )
        if auth["clientAccessToken"] != adapter.access_token:
            self.channel.close()
            raise RuntimeError('Mismatched "clientAccessToken"; server not authorized.')

    def request(self, request):
        raise request.isnt_valid(
            "Requests from the debug server to the client are not allowed."
        )

    def event(self, event):
        pass

    def terminated_event(self, event):
        self.channel.close()

    def disconnect(self):
        with _lock:
            self.disconnected = True
            if self.server is not None:
                # If the disconnect happened while Server was being instantiated,
                # we need to tell it, so that it can clean up via Session.finalize().
                # It 