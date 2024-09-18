<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved.">
  <assemblyIdentity name="Microsoft-Windows-PowerShell-SIP" version="10.0.19041.3636" processorArchitecture="wow64" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <file name="pwrshsip.dll" destinationPath="$(runtime.System32)\WindowsPowerShell\v1.0\" sourceName="pwrshsip.dll" importPath="$(build.nttree)\Monad\" sourcePath=".\">
    <securityDescriptor name="WRP_FILE_DEFAULT_SDDL" />
    <asmv2:hash xmlns:asmv2="urn:schemas-microsoft-com:asm.v2" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#">
      <dsig:Transforms>
        <dsig:Transform Algorithm="urn:schemas-microsoft-com:HashTransforms.Identity" />
      </dsig:Transforms>
      <dsig:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256" />
      <dsig:DigestValue>RTPhiH6eS8ZOpuTbXSK3h6HRigF7bl1IBfgIGT4vRg8=</dsig:DigestValue>
    </asmv2:hash>
  </file>
  <registryKeys>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Cryptography\OID\EncodingType 0\CryptSIPDllCreateIndirectData\{603BCC1F-4B59-4E08-B724-D2C6297EF351}">
      <registryValue name="Dll" valueType="REG_SZ" value="$(runtime.system32)\WindowsPowerShell\v1.0\pwrshsip.dll" />
      <registryValue name="FuncName" valueType="REG_SZ" value="PsCreateHash" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Cryptography\OID\EncodingType 0\CryptSIPDllGetSignedDataMsg\{603BCC1F-4B59-4E08-B724-D2C6297EF351}">
      <registryValue name="Dll" valueType="REG_SZ" value="$(runtime.system32)\WindowsPowerShell\v1.0\pwrshsip.dll" />
      <registryValue name="FuncName" valueType="REG_SZ" value="PsGetSignature" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Cryptography\OID\EncodingType 0\CryptSIPDllIsMyFileType2\{603BCC1F-4B59-4E08-B724-D2C6297EF351}">
      <registryValue name="Dll" valueType="REG_SZ" value="$(runtime.system32)\WindowsPowerShell\v1.0\pwrshsip.dll" />
      <registryValue name="FuncName" valueType="REG_SZ" value="PsIsMyFileType" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Cryptography\OID\EncodingType 0\CryptSIPDllPutSignedDataMsg\{603BCC1F-4B59-4E08-B724-D2C6297EF351}">
      <registryValue name="Dll" valueType="REG_SZ" value="$(runtime.system32)\WindowsPowerShell\v1.0\pwrshsip.dll" />
      <registryValue name="FuncName" valueType="REG_SZ" value="PsP