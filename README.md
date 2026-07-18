# Spring XML Configuration

A Spring Core project demonstrating **XML-based bean configuration**, **Inversion of Control (IoC)**, and **Constructor Dependency Injection** without using Spring Boot or annotations.

---

## 📖 Project Overview

This project is part of my Spring Framework learning journey. The objective is to understand how the Spring IoC Container creates, manages, and injects dependencies using XML configuration before moving to annotation-based configuration.

The application simulates a simple **Course Management System** where:

* A **Student** is enrolled in a **Course**
* A **Course** is taught by an **Instructor**

Instead of manually creating objects using the `new` keyword, Spring is responsible for creating and wiring all objects through `applicationContext.xml`.

---

## 🎯 Learning Objectives

* Understand the Spring IoC Container
* Learn XML-based bean configuration
* Configure beans using `applicationContext.xml`
* Perform Constructor Dependency Injection
* Understand bean references using `ref`
* Inject primitive values using `value`
* Retrieve beans from the Spring Container using `ApplicationContext`
* Compare Manual Dependency Injection with Spring Dependency Injection

---

## 🏗️ Project Structure

```text
src
└── main
    ├── java
    │
    │   └── org.edutech
    │       ├── app
    │       │     Main.java
    │       │
    │       ├── students
    │       │     Student.java
    │       │
    │       ├── course
    │       │     Course.java
    │       │
    │       └── instructor
    │             Instructor.java
    │
    └── resources
          applicationContext.xml
```

---

## 📚 Object Relationship

```text
Student
   │
   ▼
Course
   │
   ▼
Instructor
```

Spring creates the entire object graph and injects the dependencies automatically.

---

## ⚙️ Technologies Used

* Java 17
* Spring Framework (Spring Core)
* Maven
* XML Configuration
* IntelliJ IDEA

---

## 🔄 Bean Configuration

The project uses **constructor-based dependency injection**.

Spring creates the following beans:

* Instructor
* Course
* Student

Dependencies are configured in `applicationContext.xml`.

---

## 🚀 How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Ensure Maven dependencies are downloaded.
4. Run `Main.java`.
5. Spring loads `applicationContext.xml`.
6. Retrieve the `student` bean from the IoC Container.
7. Display the student details.

---

## 📌 Key Concepts Practiced

* Spring IoC (Inversion of Control)
* Dependency Injection (DI)
* Constructor Injection
* Bean Definition
* Bean References
* XML Configuration
* ApplicationContext
* ClassPathXmlApplicationContext
* Loose Coupling
* Object Graph Creation

---

## 🔍 Manual DI vs Spring DI

### Manual Dependency Injection

```java
Instructor instructor = new Instructor(...);
Course course = new Course(..., instructor);
Student student = new Student(..., course);
```

### Spring XML Configuration

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

Student student = context.getBean("student", Student.class);
```

The responsibility of creating and wiring objects is transferred from the application code to the Spring IoC Container.

---

## 📈 Learning Outcomes

After completing this project, I gained a practical understanding of:

* How Spring reads XML configuration files.
* How the IoC Container manages object creation.
* How constructor injection is configured using XML.
* How Spring resolves bean dependencies.
* How Spring replaces manual object wiring with container-managed beans.

---

## 🔜 Next Steps

The next project in this learning journey is:

**Spring Annotation-Based Configuration**

Topics to explore:

* `@Component`
* `@ComponentScan`
* `@Autowired`
* Annotation-driven Dependency Injection

---

## 📂 Repository Purpose

This repository is part of a structured roadmap to learn the Spring Framework from fundamentals before moving to Spring Boot and enterprise application development.
