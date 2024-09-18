<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved.">
  <assemblyIdentity name="Microsoft-Windows-LockScreenData" version="10.0.19041.4412" processorArchitecture="amd64" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <file name="LockScreenData.dll" destinationPath="$(runtime.system32)\" sourceName="LockScreenData.dll" importPath="$(build.nttree)\" sourcePath=".\">
    <securityDescriptor name="WRP_FILE_DEFAULT_SDDL" />
    <asmv2:hash xmlns:asmv2="urn:schemas-microsoft-com:asm.v2" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#">
      <dsig:Transforms>
        <dsig:Transform Algorithm="urn:schemas-microsoft-com:HashTransforms.Identity" />
      </dsig:Transforms>
      <dsig:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256" />
      <dsig:DigestValue>Gppevm4G76+km8M+niINZPJMagFhBP3aywAEQ+2S9sY=</dsig:DigestValue>
    </asmv2:hash>
  </file>
  <registryKeys>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{6B50C789-18D2-4356-9545-A43C10DBBC2B}">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="lockframework.ILockScreenSettingsTileManager" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{6B50C789-18D2-4356-9545-A43C10DBBC2B}\ProxyStubClsid32">
      <registryValue name="" valueType="REG_SZ" value="{8E585CE0-F0EB-4F2E-BDC6-6B69806291C8}" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{8788183F-ABD2-4AF4-9C40-65F1C8D77B16}">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="lockframework.ILockScreenSettingsTileManagerStatics" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{8788183F-ABD2-4AF4-9C40-65F1C8D77B16}\ProxyStubClsid32">
      <registryValue name="" valueType="REG_SZ" value="{8E585CE0-F0EB-4F2E-BDC6-6B69806291C8}" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{989CF24A-B405-4403-8C1C-887AE20410CD}">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="lockframework.ILockScreenSettingsTileData" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\Interface\{989CF24A-B405-4403-8C1C-887AE20410CD}\ProxyStubClsid32">
      <registryValue name="" valueType="REG_SZ" value="{8E585CE0-F0EB-4F2E-BDC6-6B69806291C8}" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{8E585CE0-F0EB-4F2E-BDC6-6B69806291C8}">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="LockScreenData" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{8E585CE0-F0EB-4F2E-BDC6-6B69806291C8}\InProcServer32">
      <registryValue name="" valueType="REG_SZ" value="$(runtime.system32)\LockScreenData.dll" />
      <registryValue name="ThreadingModel" valueType="REG_SZ" value="Both" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\Software\Microsoft\WindowsRuntime\ActivatableClassId\lockframework.LockScreenDataLayer">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="TrustLevel" valueType="REG_DWORD" value="0x00000000" />
      <registryValue name="ActivationType" valueType="REG_DWORD" value="0x00000000" />
      <regis