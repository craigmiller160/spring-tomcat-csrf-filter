# Spring Tomcat CSRF Filter

Spring Bindings for Tomcat's `RestCsrfPreventionFilter`. This needs to be used either with a Spring application that loads embedded Tomcat, or with an application that uses the standalone `tomcat-csrf-filter` library.

## Using the Library

Add a configuration class to the consuming Spring project that is setup like the following:

```
@Configuration
@ComponentScan(basePackages = "io.craigmiller160.csrf.spring")
public class CsrfConfig {}
```