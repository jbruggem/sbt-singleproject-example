
SBT testing project
===================

### Maven install

- use `sbt publish` (configured in build.sbt) 
- can specify a custom location for the maven repo: `-Dmaven.repo`. Example:

 `sbt -Dmaven.repo=/home/bob/tmp/mavenRepo publish`
