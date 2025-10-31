# Spring Boot Multitenant Application (MySQL + MongoDB)

This project demonstrates a **multi-tenant architecture** in **Spring Boot** that integrates both **MySQL** and **MongoDB** databases.  
It separates tenant-specific data while maintaining centralized configuration and connection management for scalable and secure applications.

---

## 🧩 Features

- **Multi-tenant support**
  - Dynamic tenant identification through interceptors and context.
  - Tenant-specific database connections.
- **Dual database integration**
  - **MySQL** for relational data.
  - **MongoDB** for document-based data.
- **Tenant-based isolation**
  - Automatic filtering and routing of requests based on tenant context.
- **Spring Boot configuration**
  - Leverages dependency injection, filters, and interceptors for clean architecture.
- **Domain-driven structure**
  - Organized by controller, domain, service, and database packages.

---

## 🗂️ Project Structure

```
java/com/spring/mongo/multitenant/
├── mongo/
│   ├── controller/
│   │   └── ChoirController.java
│   ├── domain/
│   │   ├── Choir.java
│   │   ├── Singer.java
│   │   └── VoiceType.java
│   └── service/
│       ├── database/
│       │   └── ChoirService.java
│       ├── TenantFilter.java
│       ├── WebConfiguration.java
│       └── utils/
│
├── mysql/
│   ├── config/
│   ├── user/
│   ├── TenantConnectionProvider.java
│   ├── TenantContext.java
│   ├── TenantIdentifierResolver.java
│   └── TenantInterceptor.java
│
└── MultitenantApplication.java
```

---

## ⚙️ Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **Spring Data MongoDB**
- **Hibernate MultiTenancy**
- **MySQL**
- **MongoDB**

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/mysql-mongo-multitenant.git
cd mysql-mongo-multitenant
```

### 2. Configure databases

Update your `application.yml` or `application.properties` file:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/masterdb
    username: root
    password: password
  data:
    mongodb:
      uri: mongodb://localhost:27017/
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

The app will start on [http://localhost:8080](http://localhost:8080).

---

## 🧠 Key Classes

- **TenantContext.java** – Manages tenant identification across threads.
- **TenantInterceptor.java** – Intercepts HTTP requests to determine tenant.
- **TenantIdentifierResolver.java** – Resolves tenant IDs for Hibernate sessions.
- **TenantConnectionProvider.java** – Provides per-tenant database connections.
- **ChoirController.java** – Handles REST endpoints for MongoDB entities.

---

**Author:** Your Name  
**GitHub:** [yourusername](https://github.com/yourusername)
````

Would you like me to tailor the README for **MongoDB-only**, **MySQL-only**, or keep it as a **dual database (MySQL + MongoDB)** setup as above?
