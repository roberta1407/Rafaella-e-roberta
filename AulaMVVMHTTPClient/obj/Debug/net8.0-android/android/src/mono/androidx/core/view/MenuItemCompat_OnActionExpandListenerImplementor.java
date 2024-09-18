Root\system32\drivers\UevAgentDriver.sys" />
      </categoryInstance>
    </categoryMembership>
  </memberships>
  <registryKeys>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\UevAgentDriver\Instances">
      <registryValue name="DefaultInstance" valueType="REG_SZ" value="UE-V Instance" />
    </registryKey>
    <registryKey keyName="HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\UevAgentDriver\Instances\UE-V Instance">
      <registryValue name="Altitude" valueType="REG_SZ" value="404710" />
      <registryValue name="Flags" valueType="REG_DWORD" value="0x00000001" />
    </registryKey>
  </registryKeys>
  <trustInfo>
    <security>
      <accessControl>
        <securityDescriptorDefinitions>
          <securityDescriptorDefinition name="UEV-SDDL" sddl="D:(A;;CCLCSWRPLORC;;;AU)(A;;CCDCLCSWRPWPDTLOCRSDRCWDWO;;;BA)(A;;CCDCLCSWRPWPDTLOCRSDRCWDWO;;;SY)S:(AU;FA;CCDCLCSWRPWPDTLOSDRCWDWO;;;WD)" operationHint="replace" />
          <securityDescriptorDefinition name="WRP_FILE_DEFAULT_SDDL" sddl="O:S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464G:S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464D:P(A;;FA;;;S-1-5-80-956008885-3418522649-1831038044-1853292631-2271478464)(A;;GRGX;;;BA)(A;;GRGX;;;SY)(A;;GRGX;;;BU)(A;;GRGX;;;S-1-15-2-1)(A;;GRGX;;;S-1-15-2-2)S:(AU;FASA;0x000D0116;;;WD)" operationHint="replace" description="Default SDDL for Windows Resource Protected file" />
        </securityDescriptorDefinitions>
      </accessControl>
    </security>
  </trustInfo>
  <instrumentation xmlns:win="http://manifests.microsoft.com/win/2004/08/windows/events" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <events xmlns="http://schemas.microsoft.com/win/2004/08/events">
      <provider guid="{DE29CF61-5EE6-43FF-9AAC-959C4E13CC6C}" messageFileName="%SystemRoot%\system32\Microsoft.Uev.AgentDriverEvents.dll" name="Microsoft-User Experience Virtualization-Agent Driver" resourceFileName="%Syst