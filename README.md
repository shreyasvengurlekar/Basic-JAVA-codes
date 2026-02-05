# ☕ Basic Java Codes – Beginner to OOP Concepts

This repository contains a collection of **basic to intermediate Java programs** organized topic-wise.  
It is designed for **college practicals, beginners learning Java, and interview preparation**.

All programs are written in simple Java and can be run using the command line or any Java IDE.

---

## 📂 Folder Structure

```
src/
├── 01-basics/
├── 02-number-programs/
├── 03-arrays/
├── 04-oops/
│   └── access-modifiers-package/
│       ├── Accessmain2.java
│       └── mypack/
│           └── Access.java
├── 05-exceptions/
├── 06-threads/
├── 07-gui-swing-awt/
├── 08-jdbc/
└── 09-servlets/
```



## 📌 Topics Covered

| Folder | Concepts |
|--------|----------|
| 01-basics | Basic syntax, input/output, classes |
| 02-number-programs | Palindrome, Armstrong, Fibonacci, Odd/Even, etc. |
| 03-arrays | Array operations, sorting |
| 04-oops | Inheritance, overloading, overriding, abstract classes, access modifiers |
| 05-exceptions | Try-catch, throw/throws, custom exceptions |
| 06-threads | Multithreading basics |
| 07-gui-swing-awt | Java GUI programs (Swing/AWT) |
| 08-jdbc | Database connectivity examples |
| 09-servlets | Basic Servlet programs |

---

## ⚙️ Requirements

- Java JDK 8 or higher (Recommended: JDK 11 or 17)
- Command Prompt / Terminal OR any Java IDE

Check Java installation:
```
java -version
javac -version
```

---

## ▶️ How to Run Java Programs

### 🔹 For normal Java files

1. Open terminal inside the folder where the file exists  
2. Compile:
```
javac FileName.java
```
3. Run:
```
java FileName
```

Example:
```
cd src/02-number-programs
javac Armstrong.java
java Armstrong
```

---

### 🔹 For Package Example (Access Modifiers Demo)

This example uses a package `mypack`.

Location:
src/04-oops/access-modifiers-package/

Run these commands:

```
cd src/04-oops/access-modifiers-package
javac mypack/Access.java
javac Accessmain2.java
java Accessmain2
```

---

## 🖥 GUI Programs (Swing/AWT)

Programs in `07-gui-swing-awt` open windows when executed.

Run like:
```
javac calculator.java
java calculator
```

---

## 🗄 JDBC Programs

Programs in `08-jdbc` require:
- A database (Oracle/MySQL)
- JDBC Driver setup
- Proper DB username, password, and tables

---

## 🌐 Servlet Programs

Programs in `09-servlets` require:
- Apache Tomcat or similar server
- Web project setup (cannot run using simple `javac`)

---

## 🤝 Contribution

Contributions are welcome!

1. Fork the repository
2. Add your Java program in the correct folder
3. Create a Pull Request

---

## 📜 License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute this code with attribution.

---

## 👨‍💻 Author

## Shreyas Vengurlekar
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/shreyasvengurlekar)

Created as part of learning and college practicals to build strong Java fundamentals.
