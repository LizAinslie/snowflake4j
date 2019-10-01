# snowflake4j
A simple implementation of the Twitter snowflake in Java, using the Racket epoch.

## Installing
### Maven

Add this to your repositories:
```xml
<repository>
	<name>dmrail-nexus</name>
	<url>https://nexus.dmrail.games/repository/maven-public/</url>
</repository>
```

And add this to your dependencies:
```xml
<dependency>
	<groupId>tk.racket.utils</groupId>
	<artifactId>snowflake</artifactId>
	<version>0.0.1</version><!-- or whatever version you want -->
</dependency>
```

Versions can be found in the releases or at [the Nexus repo](https://nexus.dmrail.games/#browse/browse:maven-public).

## Usage
Use the `SnowflakeGenerator` class as a singleton, like:

```java
public class Main {
	private static SnowflakeGenerator snowflakeGen = new SnowflakeGenerator();
	
	public static void main(String[] args) {
		for (i = 0; i < 10; i++) System.out.println(snowflakeGen.nextId()); // Generates and prints a new snowflake
	}
}
```
