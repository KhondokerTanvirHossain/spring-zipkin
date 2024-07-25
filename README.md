# spring-zipkin

This repository demonstrates how to set up distributed tracing using Spring Boot and Zipkin.

## Prerequisites

- Docker
- Java 17 or higher
- Spring Boot 3
- Gradle

## Getting Started

### Running Zipkin

To start Zipkin, run the following Docker command:

```sh
docker run -d -p 9411:9411 openzipkin/zipkin
```

### Application Properties

Ensure the following properties are set in your application.properties file:

```properties
management.tracing.enabled=true
management.tracing.sampling.probability=1.0
management.zipkin.tracing.endpoint=http://localhost:9411/api/v2/spans
```

### Gradle Dependencies

Add the following dependencies to your build.gradle file:

```gradle
dependencies {
    implementation 'io.micrometer:micrometer-tracing-bridge-brave'
    implementation 'io.zipkin.reporter2:zipkin-reporter-brave'
    implementation 'org.springframework.boot:spring-boot-starter-actuator'
}
```

### Accessing Zipkin

Once the application is running, you can access the Zipkin UI at:

```url
http://localhost:9411
```