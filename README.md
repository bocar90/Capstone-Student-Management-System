# Student Management System Website

The Student Management System Website is a web application designed to manage students, professors, and courses in an educational institution. It provides a user-friendly interface for administrators to perform various tasks related to student and course management.

## Features

- **User Authentication**: The website allows users to sign up and log in to access their accounts. Different roles, such as admin, professor, and student, have different access levels and permissions.

- **Student Management**: Admins can add, view, edit, and delete student records. They can also assign students to courses and view their academic information.

- **Professor Management**: Admins can manage professor records, including adding new professors and updating their information.

- **Course Management**: Admins can create, edit, and delete courses. Professors can be assigned to specific courses to handle the course-related tasks.

## Technologies Used

- **Front-end**: HTML, CSS, JavaScript, Thymeleaf (a Java template engine)
- **Back-end**: Spring Boot, Spring Security, Spring Data JPA
- **Database**: MySQL (can be configured to use other databases)
- **Build Tool**: Maven
- **Deployment**: The application can be deployed to a web server or a cloud platform.

## Installation and Setup

1. Clone the repository to your local machine.
2. Configure the MySQL database by creating a database and updating the application.properties file with the correct database URL, username, and password.
3. Build the project using Maven:
4. Run the application:
5. Access the website by navigating to http://localhost:8080 in your web browser.

## Usage

- Upon accessing the website, you will be directed to the login page. If you don't have an account, you can sign up for a new account.
- After logging in, the dashboard will display relevant information based on your role (admin, professor, or student).
- Admins can manage students, professors, and courses through the respective management pages.
- Professors can view the courses they are assigned to and manage the course-related information.
- Students can enroll in courses and view their academic progress.

## Contributors

- John Doe ([@johndoe](https://github.com/johndoe))
- Jane Smith ([@janesmith](https://github.com/janesmith))

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
