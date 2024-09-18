<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<assembly xmlns="urn:schemas-microsoft-com:asm.v3" manifestVersion="1.0" copyright="Copyright (c) Microsoft Corporation. All Rights Reserved." xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <assemblyIdentity name="Microsoft-Windows-XWizards-DUIPlugin" version="10.0.19041.3636" processorArchitecture="wow64" language="neutral" buildType="release" publicKeyToken="31bf3856ad364e35" versionScope="nonSxS" />
  <dependency discoverable="no" resourceType="Resources">
    <dependentAssembly>
      <assemblyIdentity name="Microsoft-Windows-XWizards-DUIPlugin-Mui.Resources" version="10.0.19041.3636" processorArchitecture="wow64" language="*" buildType="release" publicKeyToken="31bf3856ad364e35" />
    </dependentAssembly>
  </dependency>
  <file name="xwtpdui.dll" destinationPath="$(runtime.system32)\" sourceName="xwtpdui.dll" importPath="$(build.nttree)\" sourcePath=".\">
    <securityDescriptor name="WRP_FILE_DEFAULT_SDDL" />
    <asmv2:hash xmlns:asmv2="urn:schemas-microsoft-com:asm.v2" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#">
      <dsig:Transforms>
        <dsig:Transform Algorithm="urn:schemas-microsoft-com:HashTransforms.Identity" />
      </dsig:Transforms>
      <dsig:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256" />
      <dsig:DigestValue>31wqm9Q385tw7sMR25hT6AGF43PIdwK93BwErNjoQo4=</dsig:DigestValue>
    </asmv2:hash>
  </file>
  <registryKeys>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{777BA853-2498-4875-933A-3067DE883070}\">
      <registryValue name="" valueType="REG_SZ" value="XWizard Type plugin for DUI Class" />
      <securityDescriptor name="WRP_KEY_DEFAULT_SDDL" />
    </registryKey>
    <registryKey keyName="HKEY_CLASSES_ROOT\CLSID\{777BA853-2498-4875-933A-3067DE883070}\InProcServer32\">
      <registryValue name="" valueType="REG_EXPAND_SZ" value="%SystemRoot%\system32\xwtpdui.dll" />
      <registryValue name="ThreadingModel" valueType="REG_SZ" value="Apartment" />
    </registryKey>
  </registryKeys>
  <configuration xmlns:wcm="http://schemas.microsoft.com/WMIConfig/2002/State">
    <configurationSchema>
      <xsd:schema xmlns="Microsoft-Windows-XWizards-DUIPlugin" targetNamespace="Microsoft-Windows-XWizards-DUIPlugin" />
    </configurationSchema>
    <metadata />
  </configuration>