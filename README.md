# Spring Boot + MyBatis CRUD API with H2 Database

This project is a simple **Spring Boot** application demonstrating CRUD operations using **MyBatis** with an in-memory **H2 database**. It includes an `AppUser` model and performs a basic **join operation** example.

---

## Features

- CRUD operations for `AppUser`:
  - Create a new user
  - Read all users or by ID
  - Update user details
  - Delete a user
- Join operation example with another table (if added)
- H2 in-memory database for easy testing
- Gradle build system
- MyBatis XML-based SQL mapping

---

## Technology Stack

- Java 17+
- Spring Boot 3.x
- MyBatis 3.x
- H2 Database
- Gradle
- Maven not used (Gradle-based project)

---

## Configuration

**H2 Database and MyBatis configuration** is in `application.yml`:

```yaml
spring:
  application:
    name: springboot-mybatis-demo

  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password:

  h2:
    console:
      enabled: true

mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.parichakra.mybatis.model

server:
  port: 8080
```

## Running the Application

1. **Clone the repository:**

```bash
git clone https://github.com/parichakra/springboot-mybatis-demo.git
```


2. **Build and run using gradle**
   ```bash
   ./gradlew clean build
   ./gradlew bootRun
   ```
3. **Access the application:**

The application runs at: http://localhost:8080

H2 Database Console (Optional):

You can view the in-memory H2 database at: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: 
