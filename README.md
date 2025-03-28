Student Management System - REST API
Overview
This is a Spring Boot-based REST API for a Student Management System that allows schools to manage student admissions, courses, and enrollments. The system provides functionality for both administrators and students with proper authentication and authorization.

Features
Admin Operations

Student Admission: Add students with details such as name, date of birth, gender, unique student code, and multiple addresses.

Course Management: Upload course details, including course name, description, type, duration, and topics.

Course Assignment: Assign courses to students.

Search Functionalities:

Get students by name.

Get students assigned to a particular course.

Student Operations

Profile Management: Update profile details (email, mobile number, parents’ names, address).

Course Search & Enrollment:

Search for topics/courses they are assigned to.

Leave a course.

Technical Requirements

Must Have

Spring Boot for REST API development

Entity Layer, Repository Layer, Controller, Service Layer

JPA with Hibernate for database interactions

Spring Security-based authentication

Admin Login: Admin should be able to log in with credentials (test via Postman).

Student Validation: Students should verify their identity using student_code and date_of_birth.

Setup Instructions

Java 21

spring boot 3.x

Maven

MySQL/PostgreSQL database

Postman (for API testing)
