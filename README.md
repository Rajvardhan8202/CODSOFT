🏧 ATM Interface System (Java)
📌 Project Overview

The ATM Interface System is a console-based Java application that simulates the core functionalities of an Automated Teller Machine (ATM). The project is designed using Object-Oriented Programming (OOP) principles and follows a clean, layered architecture to separate business logic from user interaction.

This project demonstrates strong fundamentals in Java, OOP, input validation, and modular design.

🎯 Features

✅ Check account balance

✅ Deposit money

✅ Withdraw money

✅ Input validation for all operations

✅ Insufficient balance handling

✅ Clean menu-driven user interface

✅ Modular and scalable architecture

🧠 System Architecture
com.raj.codsoft.atm
├── Main.java              → Application entry point
├── model
│     └── BankAccount.java → Business logic & balance management
└── service
└── ATM.java         → ATM operations & user interaction

🛠️ Technologies Used

Java (JDK 8 or higher)

IntelliJ IDEA

Git & GitHub

Object-Oriented Programming (OOP)

▶️ How to Run the Project

Clone the repository:

git clone <your-github-repo-link>


Open the project in IntelliJ IDEA

Navigate to:

src/com/raj/codsoft/atm/Main.java


Right-click → Run 'Main.main()'

📸 Sample Output
========== ATM MENU ==========
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
   Choose an option:

🔐 Validations Implemented

Deposit amount must be greater than zero

Withdrawal amount must be greater than zero

Withdrawal not allowed if balance is insufficient

Non-numeric inputs are safely handled

🚀 Future Enhancements

PIN-based user authentication

Transaction history

Daily withdrawal limits

Database integration

Graphical User Interface (JavaFX/Swing)

Unit testing with JUnit

👨‍💻 Author

Rajvardhan
Java Developer | OOP | GitHub Projects

📄 License

