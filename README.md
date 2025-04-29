# Spring Boot User CRUD API

A simple RESTful API built with Spring Boot that performs Create, Read, Update, and Delete (CRUD) operations on user data. This project utilizes Spring Data JPA for database interactions and follows the MVC architecture.

## Features

- Create a new user
- Retrieve all users
- Retrieve a user by ID
- Update an existing user
- Delete a user
- Exception handling for resource not found scenarios

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 In-Memory Database
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/patricnilackshan/springboot-user-crud-api.git
   cd springboot-user-crud-api

   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

   The application will start on http://localhost:8080.

## API Endpoints

| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| GET    | `/users`      | Retrieve all users      |
| GET    | `/users/{id}` | Retrieve user by ID     |
| POST   | `/users`      | Create a new user       |
| PUT    | `/users/{id}` | Update an existing user |
| DELETE | `/users/{id}` | Delete a user           |

## API Documentation

This project uses [springdoc-openapi](https://springdoc.org/) to automatically generate OpenAPI-compliant documentation for the REST API.

Once the application is running, you can access the Swagger UI at:

http://localhost:8080/swagger-ui.html

This interactive UI allows you to:

- Explore all available endpoints
- View request/response models
- Send test requests directly from the browser

The OpenAPI specification in JSON format is also available at:

http://localhost:8080/v3/api-docs

These tools help with development, testing, and client integration by providing a complete, real-time view of the API.

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.patric.demo
│   │       ├── DemoApplication.java
│   │       ├── controllers
│   │       │   └── UserController.java
│   │       ├── entity
│   │       │   └── UserEntity.java
│   │       ├── exceptions
│   │       │   └── ResourceNotFoundException.java
│   │       ├── models
│   │       │   └── User.java
│   │       └── repository
│   │           └── UserRepository.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com.patric.demo
            └── DemoApplicationTests.java
```
