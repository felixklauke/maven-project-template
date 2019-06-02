# maven-project-template

Read full blog post: https://medium.com/felixklauke/ci-with-github-travisci-and-sonatype-nexus-baac333596c3

# Build Status

|             | Build Status                                                                                                            |
|-------------|-------------------------------------------------------------------------------------------------------------------------|
| Master      | [![Build Status](https://travis-ci.org/FelixKlauke/maven-project-template.svg?branch=master)](https://travis-ci.org/FelixKlauke/maven-project-template) |


# Usage

**Maven Repositories**

```xml
<repositories>
    <!-- Klauke Enterprises Releases -->
    <repository>
        <id>klauke-enterprises-maven-releases</id>
        <name>Klauke Enterprises Maven Releases</name>
        <url>https://repository.klauke-enterprises.com/repository/maven-releases/</url>
    </repository>
	
    <!-- Klauke Enterprises Snapshots -->
    <repository>
        <id>klauke-enterprises-maven-snapshots</id>
        <name>Klauke Enterprises Maven Snapshots</name>
        <url>https://repository.klauke-enterprises.com/repository/maven-snapshots/</url>
    </repository>
</repositories>
```
