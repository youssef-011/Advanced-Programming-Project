# FixNow – Home Services Web Application

<p align="center">
  <img src="https://img.shields.io/badge/Status-In%20Progress-yellow?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Version-v1.0-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Release-Initial%20Architecture-important?style=for-the-badge"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
  <img src="https://img.shields.io/badge/MVC-Architecture-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/JSP-View%20Layer-orange?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/JDBC-Data%20Access-007396?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
</p>

---

## ⚠️ Note

This project is currently under development and represents **Version 1.0 (Initial Architecture Setup)**.
It is **not the final version**.

The current release focuses on building the system structure using Spring Boot and applying MVC principles.
Further features and improvements will be implemented in upcoming versions.

---

## 📌 Overview

FixNow is a Java-based web application for home emergency services.

It connects customers with technicians for services such as:

* Plumbing
* Electricity
* AC Repair
* Locksmith services

The system is designed using **Spring Boot** with a layered MVC-based architecture to ensure clean code separation and scalability.

---

##  Architecture

The project follows **Layered MVC Architecture**:

* **Controller Layer** → Handles HTTP requests
* **Service Layer** → Contains business logic
* **Repository Layer** → Handles database operations (JDBC)
* **Model Layer** → Represents entities
* **View Layer** → JSP pages (UI)

---

##  System Flow

User → JSP → Controller → Service → Repository → Database → Response → JSP

---

##  Tech Stack

* Java
* Spring Boot
* Maven
* JSP
* JDBC
* MySQL
* MVC Architecture

---

## 📂 Project Structure

```text
src/main/java/com/fixnow
├── controller
├── service
├── repo
├── model
└── FixNowApplication.java

src/main/resources
├── application.properties

src/main/webapp/WEB-INF/jsp
├── login.jsp
├── register.jsp
├── customerDashboard.jsp
├── technicianDashboard.jsp
├── createRequest.jsp
├── viewRequests.jsp
├── requestDetails.jsp
└── addReview.jsp
```

---

##  Current Features

* User Registration & Login
* Service Request Creation
* Request Tracking
* Technician Interaction
* Review System (structure prepared)

---

##  How to Run

1. Clone the repository
2. Open in Eclipse or IntelliJ
3. Configure MySQL database
4. Update application.properties
5. Run the Spring Boot application

---

##  Release

This repository includes **FixNow v1.0 – Initial Architecture Setup**

---

##  Future Improvements

* Complete Service Layer Logic
* Full Repository Integration
* UI Enhancements
* Input Validation
* Error Handling
* Full System Integration

---

##  Notes

* This version focuses on architecture, not full functionality
* The project follows course-based implementation using Spring Boot and MVC
* Future versions will expand features and improve system performance
