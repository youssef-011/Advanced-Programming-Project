# FixNow – Home Services Web Application

<p align="center">
  <img src="https://img.shields.io/badge/Status-In%20Progress-yellow?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Version-v1.0-blue?style=for-the-badge"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Servlets-000000?style=for-the-badge&logo=apachetomcat&logoColor=white"/>
  <img src="https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/MVC-Architecture-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
</p>

---

## ⚠️ Note

This project is currently under development and represents **Version 1.0 (Initial Structure)**.
The current version focuses on setting up the architecture and core flow.
Further improvements and features will be added in upcoming versions.

---

## 📌 Overview

FixNow is a Java-based web application that connects customers with technicians for home services such as plumbing, electricity, and AC repair.

The system is designed following MVC architecture using Servlets, JDBC, and MySQL.

---

##  Architecture

The project follows **MVC + Layered Structure**:

* Model → Java Classes (Entities)
* Repository → JDBC (Database Layer)
* Service → Business Logic
* Controller → Servlets
* View → JSP

---

## 🔁 System Flow

User → JSP → Controller → Service → Repository → Database → Response → JSP

---

## ⚙️ Technologies Used

* Java
* Servlets
* JDBC
* MySQL
* JSP
* Maven

---

## 📂 Project Structure

```text id="s1m2k9"
src/main/java/com/fixnow
├── controller
├── service
├── repo
├── model
└── FixNowApplication.java

src/main/webapp/WEB-INF/jsp
├── login.jsp
├── register.jsp
├── customerDashboard.jsp
├── technicianDashboard.jsp
├── createRequest.jsp
├── viewRequests.jsp
├── requestDetails.jsp
├── addReview.jsp
```

---

##  Features

* User Registration & Login
* Create Service Requests
* Track Request Status
* Technician Interaction
* Review System

---

##  How to Run

1. Import project into Eclipse
2. Configure Apache Tomcat
3. Setup MySQL database
4. Update DBConnection credentials
5. Run project on server

---

##  Future Improvements

* UI Enhancements
* Input Validation
* Error Handling
* Full Integration
* Additional Features (Payments, Notifications)

---

##  Release

This repository includes **Version 1.0 (Initial Architecture Setup)**.
