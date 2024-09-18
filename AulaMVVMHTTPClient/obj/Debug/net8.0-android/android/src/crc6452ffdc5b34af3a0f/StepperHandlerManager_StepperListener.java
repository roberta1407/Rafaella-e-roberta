<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved.">
  <assemblyIdentity name="Microsoft-Windows-osk" version="10.0.19041.4355" processorArchitecture="amd64" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <dependency discoverable="no" resourceType="Resources">
    <dependentAssembly>
      <assemblyIdentity name="Microsoft-Windows-osk.Resources" version="10.0.19041.4355" processorArchitecture="amd64" language="*" buildType="release" publicKeyToken="31bf3856ad364e35" />
    </dependentAssembly>
  </dependency>
  <file name="osk.exe" destinationPath="$(runtime.system32)\" sourceName="osk.exe" importPath="$(build.nttree)\" sourcePath=".\">
    <securityDescriptor name="WRP_FILE_DEFAULT_SDDL" />
    <asmv2:hash xmlns:asmv2="urn:schemas-microsoft-com:asm.v2" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#">
      <dsig:Transforms>
        <dsig:Transform Algorithm="urn:schemas-microsoft-com:HashTransforms.Identity" />
      </dsig:Transforms>
      <dsig:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256" />
      <dsig:DigestValue>7WBdvdlpkZ5EMJY40i6ymZueyip34rwJ9gYrCx+qBao=</dsig:DigestValue>
    </asmv2:hash>
  </file>
  <registryKeys>
    <registryKey key