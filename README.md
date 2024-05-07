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

# App run on :
localhost:8080

# The URL of the Eureka server. This is where the service will register itself.
http://localhost:8761/eureka

# The probability of a request being sampled for tracing. 1 means all requests will be traced.
management.tracing.sampling.probability=1

Sure, here's a brief documentation for the endpoints in your project:

## API Endpoints

### Movie Streaming Service

#### GET /stream/{videoPath}
Streams a video from the specified path.

- Path parameter: `videoPath` - The path of the video to stream.

#### GET /stream/with-id/{videoId}
Streams a video with the specified ID.

- Path parameter: `videoId` - The ID of the video to stream.

### Movie Catalog Service

#### POST /movie-info/save
Saves a list of movie information.

- Request body: A list of `MovieInfo` objects to save.

#### GET /movie-info/list
Gets a list of all movie information.

#### GET /movie-info/find-path-by-id/{movieId}
Finds the path of a movie by its ID.

- Path parameter: `movieId` - The ID of the movie to find the path for.

### API Gateway

The API Gateway service routes requests to the appropriate service. The routes are defined in the `application.properties` file.

#### Route: /movie-info/**
Routes requests to the Movie Catalog Service.

#### Route: /stream/**
Routes requests to the Movie Streaming Service.

