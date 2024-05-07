# Microservice Test Project

This project is a microservice-based application built with Java, Spring Boot, and Gradle.

## Services

The project consists of several services, including:

- API Gateway
- Movie Streaming Service
- Movie Catalog Service
- Config Server
- Service Registry

## Setup

To run the project, follow these steps:

1. Clone the repository: `git clone https://github.com/DanielGanchev/microservice-test-project.git`
2. Navigate to the project directory: `cd microservice-test-project`
3. Build the project: `./gradlew build`
4. Run the services: `./gradlew bootRun`

## Configuration

Each service has its own configuration file. For example, the Movie Streaming Service has the following configuration:



# The URL of the Eureka server. This is where the service will register itself.
http://localhost:8761/eureka

# The probability of a request being sampled for tracing. 1 means all requests will be traced.
management.tracing.sampling.probability=1
