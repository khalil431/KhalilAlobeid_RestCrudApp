# Student REST CRUD API

This is a **Spring Boot REST API project** that I developed using **Java and Spring Boot**. It is a **CRUD web service application** designed to manage student information through RESTful endpoints. The application allows users to **create, read, update, and delete student records** stored in a database.  

The project follows a **layered architecture** consisting of **Controller, Service, Repository, and Entity layers** to maintain clean separation of concerns. It uses **Spring Web, Spring Data JPA, and Jakarta Persistence** for building the backend API.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Installation

Step-by-step instructions on how to get the development environment running.

1. **Clone the Repository:**
   - Clone the project repository from GitHub:
     ```bash
     git clone https://github.com/yourusername/RestCrudApp.git
     ```
   - Alternatively, download the repository ZIP file and extract it.

2. **Open in IDE:**
   - Open the project in **IntelliJ IDEA**, **Eclipse**, or **Visual Studio Code**.
   - Select **Open Project** and navigate to the project folder.

3. **Install Dependencies:**
   - Ensure **Maven** dependencies are installed automatically.
   - If not, run:
     ```bash
     mvn clean install
     ```

4. **Configure Database (Optional):**
   - Configure your database connection in the `application.properties` file if using an external database.

5. **Run the Application:**
   - Run the main class:
     ```
     RestCrudAppApplication.java
     ```
   - Or execute using Maven:
     ```bash
     mvn spring-boot:run
     ```

6. **Access the API:**
   - The application will start on:
     ```
     http://localhost:8085
     ```

## Usage

Once the application is running:

- Use REST API tools such as **Postman**, **Insomnia**, or **cURL** to interact with the API.
- Perform CRUD operations on student records using the provided endpoints.
- Each student record includes:
  - Student ID
  - Name
  - Fees
  - Subject Name

The application uses a layered structure:

- **Controller Layer** – Handles HTTP requests.
- **Service Layer** – Contains business logic.
- **Repository Layer** – Communicates with the database using Spring Data JPA.
- **Entity Layer** – Represents the database model.

## API Endpoints

| Method | Endpoint | Description |
|------|------|------|
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| POST | `/students` | Create a new student |
| PUT | `/students/{id}` | Update an existing student |
| DELETE | `/students/{id}` | Delete a student |

### Example JSON Request

**POST /students**

```json
{
  "id": 1,
  "name": "John Doe",
  "fees": 1200.50,
  "subName": "Mathematics"
}
```
The response would be:
```json
{
  "id": 1,
  "name": "John Doe",
  "fees": 1200.50,
  "subName": "Mathematics"
}
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
