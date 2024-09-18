# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See LICENSE in the project root
# for license information.

from __future__ import annotations

import os
import subprocess
import sys
import threading
import time

import debugpy
from debugpy import adapter
from debugpy.common import json, log, messaging, sockets
from debugpy.adapter import components, sessions
import traceback
import io

access_token = None
"""Access token used to authenticate with the servers."""

listener = None
"""Listener socket that accepts server connections."""

_lock = threading.RLock()

_connections = []
"""All servers that are connected to this adapter, in order in which they connected.
"""

_connections_changed = threading.Event()


class Connection(object):
    """A debug server that is connected to the adapter.

    Servers that are not participating in a debug session are managed directly by the
    corresponding Connection instance.

    Servers that are participating in a debug session are managed by that sessions's
    Server component instance, but Connection object remains, and takes over again
    once the session ends.
    """

    disconnected: bool

    process_replaced: bool
    """Whether this is a connection to a process that is being replaced in situ
    by another process, e.g. via exec().
    """

    server: Server | None
    """The Server co