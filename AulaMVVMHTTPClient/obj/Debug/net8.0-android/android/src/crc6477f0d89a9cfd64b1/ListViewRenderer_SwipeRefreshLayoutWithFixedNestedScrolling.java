<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved.">
  <assemblyIdentity name="Microsoft-Windows-DeviceManagement-PolicyDefinition-ADMXLanmanWorkstation" version="10.0.19041.3636" processorArchitecture="amd64" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <registryKeys>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\ADMX_LanmanWorkstation\Pol_CipherSuiteOrder">
      <registryValue name="policytype" valueType="REG_DWORD" value="0x00000001" />
      <registryValue name="mergealgorithm" valueType="REG_DWORD" value="0x00000003" />
      <registryValue name="admxMetadataDevice" valueType="REG_BINARY" value="303753451A0000004D756C7469546578745F43697068657253756974654F72646572401000000043697068657253756974654F72646572000000" />
      <registryValue name="RegKeyPathRedirect" valueType="REG_SZ" value="Software\Policies\Microsoft\Windows\LanmanWorkstation" />
      <registryValue name="Behavior" valueType="REG_DWORD" value="0x00000060" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\ADMX_LanmanWorkstation\Pol_EnableHandleCachingForCAFiles">
      <registryValue name="policytype" valueType="REG_DWORD" value="0x00000001" />
      <registryValue name="mergealgorithm" valueType="REG_DWORD" value="0x00000003" />
      <registryValue name="admxMetadataDevice" valueType="REG_BINARY" value="30313D0100000000323D000000000000" />
      <registryValue name="RegKeyPathRedirect" valueType="REG_SZ" value="Software\Policies\Microsoft\Windows\LanmanWorkstation" />
      <registryValue name="RegValueNameRedirect" valueType="REG_SZ" value="EnableHandleCachingForCAFiles" />
      <registryValue name="Behavior" valueType="REG_DWORD" value="0x00000060" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\ADMX_LanmanWorkstation\Pol_EnableOfflineFilesforCAShares">
      <registryValue name="policytype" valueType="REG_DWORD" value="0x00000001" />
      <registryValue name="mergealgorithm" valueType="REG_DWORD" value="0x00000003" />
      <registryValue name="admxMetadataDevice" valueType="REG_BINARY" value="30313D0100000000323D000000000000" />
      <registryValue name="RegKeyPathRedirect" valueType="REG_SZ" value="Software\Policies\Microsoft\Windows\LanmanWorkstation" />
      <registryValue name="RegValueNameRedirect" valueType="REG_SZ" value="AllowOfflineFilesforCAShares" />
      <registryValue name="Behavior" valueType="REG_DWORD" value="0x00000060" />
    </registryKey>
  </registryKeys>
  <trustInfo>
    <security>
      <accessControl>
        <securityDescriptorDefinitions>
          <securityDescriptorDefinition name="WRP_REGKEY_DEFAULT_SDDL" sddl="O:S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464G:S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464D:P(A;CI;GA;;;S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464)(A;CI;GR;;;SY)(A;CI;GR;;;BA)(A;CI;GR;;;BU)(A;CI;GR;;;S-1-15-2-1)(A;CI;GR;;;S-1-15-3-1024-1065365936-1281604716-3511738428-16547