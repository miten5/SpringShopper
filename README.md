# SpringShopper

This is a continuously evolving E-Commerce Platform built using Java and Spring Boot. The project focuses on creating a robust and scalable online store management system with features like product management, shopping cart functionality, and secure transactions. I'm updating this project daily to add more features and enhancements.

---

## Features
- **User Authentication**: Secure user login, registration, and session management using Spring Security.
- **Product Management**: CRUD operations for managing products in the store, with real-time validation using **Spring Validator**.
- **Shopping Cart**: Add, update, and remove products from the cart with seamless user experience.
- **Order Processing**: Place orders and handle order details with automatic updates in the database.
- **MySQL Integration**: The application connects to a **MySQL database** to store all data related to products, users, orders, and more.
- **Form Validation**: Comprehensive validation for user input (registration, order forms) using **Spring Validator**.
- **RESTful API**: Exposes RESTful endpoints for future expansion (mobile apps, third-party integrations).

---

## Technologies Used
- **Backend**: Java, Spring Boot (Spring Web, Spring Data JPA, Spring Security)
- **Database**: MySQL
- **Validation**: Spring Validator for data integrity and user input validation
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap (optional)
- **Build Tool**: Maven
- **Version Control**: Git

---

## Getting Started

### Prerequisites
Ensure you have the following installed:
- Java 11+
- MySQL
- Maven

### Installation Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/miten5/SpringShopper.git
   
2. **Navigate to the project directory:**
   ```bash
   cd SpringBoot-ECommerce-App
   
3. **Configure MySQL:** Update ```src/main/resources/application.properties``` with your MySQL database details:
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
    spring.datasource.username=your-username
    spring.datasource.password=your-password
   
4. **Run the application:** Use Maven to build and run the project:
   ```bash
   mvn spring-boot:run

5. **Access the application:** Open your browser and visit:
   ```bash
   http://localhost:8080
   
### Acknowledgments
Special thanks to the open-source community for the tools and libraries that helped in building this project.