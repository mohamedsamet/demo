## Spring Boot
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
https://www.baeldung.com/spring-boot
###Features: 
* Create stand-alone Spring applications
  
*  Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
  
*  Provide opinionated 'starter' dependencies to simplify your build configuration
  
*  Automatically configure Spring and 3rd party libraries whenever possible
  
*  Provide production-ready features such as metrics, health checks, and externalized configuration
  
*  Absolutely no code generation and no requirement for XML configuration

####Auto configuration
* @SpringBootApplication encapsulates @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.

* Spring boot main class can hold bean methods with @Bean. and it is used to explicitly declare a single bean, rather than letting Spring do it automatically. It decouples the declaration of the bean from the class definition and lets you create and configure beans exactly how you choose.

* Spring boot register those Beans on the application context interface, then they will be managed with the Ioc container for dependency injection.

* @ConditionalOnClass, @ConditionalOnProperty, @ConditionalOnResource allow to make condition for creating beans regarding class presence or attribute value ...

### Starters
Starter POMs are a set of convenient dependency descriptors that you can include in your application. You get a one-stop-shop for all the Spring and related technology that you need, without having to hunt through sample code and copy-paste loads of dependency descriptors.
* Increase pom manageability
* Production-ready, tested & supported dependency configurations
* Decrease the overall configuration time for the project

### Actuators
Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.

Once this dependency is on the classpath, several endpoints are available for us out of the box. As with most Spring modules, we can easily configure or extend it in many ways.

### Database alterations
 * Spring Boot makes it really easy to manage our database changes. If we leave the default configuration, it'll search for entities in our packages and create the respective tables automatically.

 * But we'll sometimes need more fine-grained control over the database alterations. And that's when we can use the data.sql and schema.sql files in Spring.