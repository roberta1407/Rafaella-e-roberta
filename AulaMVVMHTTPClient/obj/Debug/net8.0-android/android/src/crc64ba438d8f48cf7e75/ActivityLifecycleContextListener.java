<?xml version="1.0" encoding="utf-8"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" description="$(resourceString.description)" displayName="$(resourceString.displayName)" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved." company="Microsoft" creationTimeStamp="2023-11-28T13:43:24" lastUpdateTimeStamp="2023-11-28T13:43:24" buildFilter="">
  <assemblyIdentity name="Microsoft-Windows-Help-ClientOOBE-N-Feature-Deployment-LanguagePack" version="10.0.19041.3758" processorArchitecture="amd64" language="et-EE" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Windows-Help-Credits.Resources" version="10.0.19041.3758" processorArchitecture="amd64" language="en-US" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Windows-Help-OOBECortanaLearnMore.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="et-EE" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Windows-Help-OOBEOptInDetails_N.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="et-EE" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Windows-Help-OOBEPrivacySettingsLearnMore.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="en-US" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Windows-Help-PrivStatement_N.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="et-EE" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <deployment xmlns="urn:schemas-microsoft-com:asm.v3" />
</assembly>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            <?xml version="1.0" encoding="utf-8"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" description="$(resourceString.description)" displayName="$(resourceString.displayName)" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved." company="Microsoft" creationTimeStamp="2023-10-20T03:51:09" lastUpdateTimeStamp="2023-10-20T03:51:09" buildFilter="">
  <assemblyIdentity name="Microsoft-Hyper-V-Offline-Core-Group-merged-Deployment-LanguagePack" version="10.0.19041.3636" processorArchitecture="amd64" language="lv-LV" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="HyperV-CommandLine-Tool.resources" version="10.0.19041.1" processorArchitecture="amd64" language="en-US" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Hyper-V-VStack-HyperVCluster.Resources" version="10.0.19041.3636" processorArchitecture="amd64" language="lv-LV" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="HyperV-SbResources.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="en-US" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <dependency discoverable="yes">
    <dependentAssembly dependencyType="install">
      <assemblyIdentity name="Microsoft-Hyper-V-PVHD-Parser.Resources" version="10.0.19041.1" processorArchitecture="amd64" language="en-US" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
    </dependentAssembly>
  </dependency>
  <deployment xmlns="urn:schemas-microsoft-com:asm.v3" />
</assembly>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           <?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved.">
  <assemblyIdentity name="Microsoft-Windows-IE-F12App" version="11.0.19041.3636" processorArchitecture="x86" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <directories>
    <directory destinationPath="$(runtime.system32)\F12" attributes="system">
      <securityDescriptor name="WRP_PARENT_DIR_DEFAULT_SDDL" />
    </directory>
  </directories>
  <file name="F12App.dll" destinationPath="$(runtime.system32)\F12\" sourceName="F12App.dll" importPath="$(build.nttree)\" sourcePath=".\">
    <securityDescriptor name="WRP_FILE_DEFAULT_SDDL" />
    <asmv2:hash xmlns:asmv2="urn:schemas-microsoft-com:asm.v2" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#">
      <dsig:Transforms>
        <dsig:Transform Algorithm="urn:schemas-microsoft-com:HashTransforms.Identity" />
      </dsig:Transforms>
      <dsig:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256" />
      <dsig:DigestValue>HeIgC5FSfzIHKbEHcMUuGpoHVwhRPsj3RlLVOlozw5A=</dsig:DigestValue>
    </asmv2:hash>
  </file>
  <registryKeys>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{28BCCB9A-E66B-463C-82A4-09F320DE94D7}\">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="F12 Developer Tools" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{28BCCB9A-E66B-463C-82A4-09F320DE94D7}\InProcServer32\">
      <securityDescriptor name="WRP_REGKEY_DEFAULT_SDDL" />
      <registryValue name="" valueType="REG_SZ" value="$(runtime.system32)\F12\F12App.dll" />
      <registryValue name="ThreadingModel" valueType="REG_SZ" value="Apartment" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\Software\Microsoft\F12">
      <registryValue name="clsid" valueType="REG_SZ" value="{28BCCB9A-E66B-463C-82A4-09F320DE94D7}" />
    </registryKey>
  </registryKeys>
  <trustInfo>
    <security>
      <accessControl>
        <securityDescriptorDefinitions>
          <securityDescriptorDefin