# Campus Lost and Found System

A Java-based console application for reporting, searching, and claiming
lost and found items on a college campus.

## Overview

The **Campus Lost and Found System** provides a simple centralized
workflow for handling lost and found belongings on campus.

Students and staff can report lost or found items, view available items,
search by name or category, and submit claims. An administrator can log
in and approve or reject submitted claims.

The current version is a **console-based Java application** that uses
in-memory Java collections while the program is running.

## Objectives

-   Provide a simple way to report lost items.
-   Provide a simple way to report found items.
-   Allow users to view reported items.
-   Allow searching by item name and category.
-   Allow users to submit claims for existing items.
-   Allow an administrator to approve or reject claims.
-   Display basic item and claim statistics.
-   Validate user input and handle common errors.
-   Keep the application modular and easy to understand.

## Features

### User Features

-   Report a lost item
-   Report a found item
-   View all reported items
-   Search items by name
-   Search items by category
-   Submit a claim for an item
-   View submitted claims

### Admin Features

-   Admin login
-   View claims
-   Approve claims
-   Reject claims
-   View basic project statistics

### Validation

-   Input validation
-   Error messages for invalid input
-   Validation of claim-related input

## Technologies Used

-   **Java**
-   **Object-Oriented Programming (OOP)**
-   **Inheritance**
-   **ArrayList / Java Collections**
-   **IntelliJ IDEA**
-   **Git**
-   **GitHub**

## System Architecture

The project follows a simple modular structure:

-   **Model layer** --- represents users, items, lost/found items, and
    claims.
-   **Service layer** --- contains the main application logic for items
    and claims.
-   **Main class** --- controls the menu-driven console workflow and
    user interaction.

## Project Structure

``` text
CampusLostAndFound
└── src
    └── com.lostfound
        ├── Main.java
        ├── model
        │   ├── User.java
        │   ├── Admin.java
        │   ├── Item.java
        │   ├── LostItem.java
        │   ├── FoundItem.java
        │   └── Claim.java
        └── service
            ├── ItemService.java
            ├── FoundItemService.java
            └── ClaimService.java
```

## Class Responsibilities

  -----------------------------------------------------------------------
  Class                               Responsibility
  ----------------------------------- -----------------------------------
  `User`                              Represents a system user

  `Admin`                             Represents an administrator

  `Item`                              Stores common item information

  `LostItem`                          Represents a lost item and extends
                                      `Item`

  `FoundItem`                         Represents a found item and extends
                                      `Item`

  `Claim`                             Stores claim information and status

  `ItemService`                       Adds, displays, searches, and
                                      calculates item statistics

  `FoundItemService`                  Stores and displays found items

  `ClaimService`                      Submits, displays, approves,
                                      rejects, and calculates claim
                                      statistics

  `Main`                              Controls the complete menu-driven
                                      application
  -----------------------------------------------------------------------

## Application Workflow

1.  Start the application.
2.  Select an available operation from the console menu.
3.  Report a lost or found item.
4.  View or search reported items.
5.  Submit a claim using an existing Item ID.
6.  The administrator logs in.
7.  The administrator reviews submitted claims.
8.  The administrator approves or rejects a claim.
9.  The application displays the result and statistics.

## UML and Design Diagrams

The repository contains the following diagrams:

-   [Architecture Diagram](diagrams/Architecture%20Diagram.png)
-   [Class Diagram](diagrams/Class%20Diagram.png)
-   [Sequence Diagram](diagrams/Sequence%20Diagram.png)
-   [Use Case Diagram](diagrams/Use%20Case%20Diagram.png)
-   [Workflow Diagram](diagrams/Workflow%20Diagram.png)

## Entity Relationship Diagram

The project also includes an ER diagram representing the main entities
and their relationships.

-   [ER Diagram](diagrams/ER%20Diagram.png)

> If your ER diagram has a different filename, update the link above to
> match the exact filename in the `diagrams` folder.

## Screenshots

Example application screenshots are stored in the `screenshots` folder.

The screenshots demonstrate:

-   Main menu
-   Lost item reporting
-   Found item reporting
-   Item search/display
-   Claim submission
-   Claim viewing
-   Admin operations
-   Application exit

## Project Report

The complete project report is available here:

[Project Report](Project%20Report.pdf)

The report contains the project introduction, problem statement,
objectives, requirements, architecture, workflow, UML design,
implementation details, screenshots, testing approach, challenges,
learnings, future enhancements, conclusion, and references.

## Testing

The application was tested through its main console workflows,
including:

-   Reporting lost items
-   Reporting found items
-   Viewing reported items
-   Searching by item name
-   Searching by category
-   Submitting claims
-   Viewing claims
-   Admin authentication
-   Approving claims
-   Rejecting claims
-   Input validation
-   Exiting the application

## Data Storage

The current version uses **in-memory storage with Java collections**.

This means data is available while the application is running but is not
permanently stored in a database after the program ends.

## Design Decisions

-   Java was used to demonstrate object-oriented programming concepts.
-   Common item properties are placed in the `Item` class.
-   `LostItem` and `FoundItem` extend `Item` to demonstrate inheritance.
-   Service classes separate application logic from the data model.
-   `ArrayList` is used for simple in-memory collection management.
-   A console interface keeps the project simple and focused on core
    functionality.

## Challenges Faced

-   Designing a clear structure for lost and found items.
-   Managing relationships between users, items, and claims.
-   Implementing claim approval and rejection.
-   Handling invalid user input.
-   Keeping the application modular using model and service classes.
-   Testing different menu-driven workflows.

## Key Learnings

This project provided practical experience with:

-   Java programming
-   Object-oriented programming
-   Inheritance
-   Java collections
-   Modular program design
-   Input validation
-   Basic authentication
-   Testing
-   Git and GitHub
-   Project documentation

## Future Enhancements

Possible improvements for a future version include:

-   Database integration for permanent data storage
-   Graphical user interface
-   Web-based version
-   Image upload for lost and found items
-   Email or notification support
-   More advanced user authentication
-   Better search and filtering
-   Persistent user and claim history

## Conclusion

The Campus Lost and Found System provides a simple and organized way to
manage lost and found items on a college campus.

The project demonstrates practical use of Java, object-oriented
programming, inheritance, collections, modular design, validation,
testing, and GitHub. Although the current version is console-based and
uses in-memory storage, its structure provides a clear foundation for
future database, GUI, and web-based improvements.

## References

1.  VITyarthi --- Build Your Own Project instructions and submission
    guidelines.
2.  Java programming documentation and learning resources used during
    development.
3.  Git and GitHub documentation used for version control and repository
    management.
4.  IntelliJ IDEA documentation and development resources.

## Author

**Aditya Verma**\
Registration Number: **25BAI10231**\
Technology: **Java**\
Development Environment: **IntelliJ IDEA**\
Academic Year: **2026**
