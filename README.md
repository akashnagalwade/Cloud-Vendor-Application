# Cloud Vendor Application

A RESTful API built with Spring Boot to manage Cloud Vendor information with full CRUD operations.

# Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger / OpenAPI
- Maven

# Features
- Add, update, delete and retrieve Cloud Vendor details
- RESTful API design following best practices
- Database integration using Spring Data JPA and MySQL
- API documentation with Swagger UI

# Project Structure
src/
├── main/
│   ├── java/
│   │   └── com/cloudvendor/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── resources/
│       └── application.properties

# How to Run

1. Clone the repository
```bash
git clone https://github.com/akashnagalwade/Cloud-Vendor-Application.git
```

2. Configure MySQL in `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cloudvendordb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application
```bash
mvn spring-boot:run
```

4. Open Swagger UI
5. http://localhost:8080/swagger-ui.html

6. # API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /cloudvendor/{id} | Get vendor by ID |
| GET | /cloudvendor | Get all vendors |
| POST | /cloudvendor | Create new vendor |
| PUT | /cloudvendor | Update vendor |
| DELETE | /cloudvendor/{id} | Delete vendor |

# Author
**Akash Nagalwade** – Software Developer
