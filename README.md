 # 🚉 Railway Ticket Management System

A console-based Java application designed to efficiently manage and retrieve railway support tickets from a relational database. The system uses JDBC to connect with a MySQL backend and provides a simple interface for querying and displaying ticket information. The architecture follows modular design principles, ensuring separation of concerns, easy maintenance, and future scalability.

## 🛠 Tech Stack
- Java (Core)
- JDBC
- MySQL
- Object-Oriented Programming (OOP)

## 📌 Key Features
- ✅ Fetch and display ticket details from a connected database
- ✅ Clean code structure using object-oriented practices
- ✅ JDBC integration for database connectivity
- ✅ Easy to extend with additional modules (e.g., ticket creation, deletion, user login)

 ## 📦 Dependencies & Configuration
Java 8 or above

MySQL Server

JDBC Driver (included in IDE or manually added to classpath)

A configured tickets table in MySQL

## 📂 Project Structure
TicketManagement/ ├── src/ │ └── main/ │ └── java/ │ └── org/ │ └── example/ │ ├── Main.java # Entry point for the application │ ├── DatabaseManager.java # Handles connection setup and queries │ └── TicketFetcher.java # Manages ticket retrieval logic └── README.md
