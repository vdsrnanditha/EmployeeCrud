# Efficient REST API with Employee CRUD functionality
This project is a sample REST API built with Spring Boot, Hibernate, and MySQL database. The API allows users to perform CRUD operations on student data.

# Getting Started

Clone the repository: git clone https://github.com/example/student-api.git

Navigate to the project directory

Set up the MySQL database

Start the application: ./mvnw spring-boot:run

Access the API at: http://localhost:8080

# Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | /getemps | Retrieve all students |
| `GET` | /getemp/{id}  | Retrieve student by ID |
| `POST` | /save | Create a new student |
| `PUT` | /{id}  | Update an existing student |
| `DELETE` | /delete/{id}  | Delete a student by ID |

# Technologies Used
Spring Boot

Hibernate

MySQL(workbench) database

RESTful API

Maven

# Contributing

Contributions are welcome. Feel free to open an issue or submit a pull request.

# License

This project is licensed under the MIT License. See the LICENSE.md file for details.
