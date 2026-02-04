# Item Management Application

This is a simple Java Spring Boot RESTful API application used to manage items.
The application allows users to add an item and retrieve an item by its ID.
It is implemented using Spring Boot and follows REST principles.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Mysql
- Maven

## How to Run the Application

### Step 1: Prerequisites
- Java 8 or higher installed
- Maven installed
- IDE (IntelliJ / Eclipse) or Command Prompt

### Step 2: Open the Project
Open the project in your IDE or navigate to the project folder using terminal.

### Step 3: Run the Application
Run the main class:

ItemManagementApplication.java

## Database Configuration

The application uses an MySql in-memory database.

Important properties from application.properties:

## API Endpoints

### 1. Add Item

- URL: /api/items
- Method: POST
- Description: Adds a new item to the database.

### 2. Get Item by ID

- URL: /api/items/{id}
- Method: GET
- Description: Retrieves an item using its ID.


## Project Structure

src/main/java
└── Item/Management/Application
├── controller   - Handles HTTP requests
├── service      - Contains business logic
├── repository   - Handles database operations
├── entity       - Represents database tables
└── ItemManagementApplication.java

## Important Implementation Details

- The Item entity is annotated with @Entity and mapped to a database table.
- Spring Data JPA is used to persist data into the database.
- Input validation is implemented using @NotBlank annotations.
- @Valid is used in the controller to validate request data.
- The service layer communicates with the repository layer.