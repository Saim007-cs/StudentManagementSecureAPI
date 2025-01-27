The Student Management System API is a RESTful service built using Spring Boot, designed to handle various student management tasks such as adding, updating, deleting, and retrieving student information. This system can be integrated with front-end applications or used independently for managing student records.

Features-
CRUD Operations: Manage students (Create, Read, Update, Delete).
Student Details: Store and retrieve student information such as name, ID, Department, and having laptop.
Search Functionality: Search students by ID, name, or department.
Secure Endpoints: Role-based access control for different users (Admin, Teacher).
Exception Handling: Provides meaningful error messages for invalid requests.
Data Validation: Ensures that all inputs are valid and properly formatted.

Technologies Used-
Spring Boot: For building the REST API.
Spring Data JPA: For database interaction.
H2 Database (or any preferred DB): For storing student records.
Spring Security (optional): For user authentication and authorization.
Maven/Gradle: For project dependency management.
