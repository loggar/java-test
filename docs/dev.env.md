# dev env

- jdk 16 (ms-jdk-16.0.1+9)

Setting java home for maven (powershell)

```powershell
> $Env:JAVA_HOME = "C:\_dev\Java\ms-jdk-16.0.1+9"

> echo $env:JAVA_HOME
> Get-ChildItem Env:JAVA_HOME

```

Set dev terminal settings (java, maven)

```
$env:Path = "C:\Windows;C:\WINDOWS;C:\WINDOWS\system32;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\OpenSSH\;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\ProgramData\chocolatey\bin;C:\Program Files\dotnet\;C:\Program Files\Docker\Docker\resources\bin;C:\ProgramData\DockerDesktop\version-bin;C:\_dev\git\cmd;C:\Users\webnl\AppData\Local\nvs\";
$Env:JAVA_HOME = "C:\_dev\Java\openJDK-12"; $env:Path += ";C:\_dev\Java\ms-jdk-16.0.1+9\bin";
$Env:MAVEN_HOME = "C:\_dev\maven\apache-maven-3.8.1"; $env:Path += ";C:\_dev\maven\apache-maven-3.8.1\bin";
```
