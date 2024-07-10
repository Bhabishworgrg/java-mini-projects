# Java Mini Projects
This repository contains a collection of small Java projects showcasing various concepts and techniques. These projects cover various fundamental and advanced topics in Java programming, providing practical examples and solutions.


## Table of Contents
- [Getting Started](#getting-started)
- [Projects](#projects)
  - [Project 1: Hello World](#project-1-hello-world)
  - [Project 2: Hello World Again](#project-2-hello-world-again)
  - [Project 3: Hello World Yet Again](#project-3-hello-world-yet-again)
  - [Project 4: Name Greeter](#project-4-name-greeter)
  - [Project 5: Integer Input Checker](#project-5-integer-input-checker)
  - [Project 6: Integer Type Checker](#project-6-integer-type-checker)
  - [Project 7: Quadratic Equation Solver](#project-7-quadratic-equation-solver)
  - [Project 8: Shape Drawer](#project-8-shape-drawer)
- [Prerequisites](#prerequisites)
- [Running the Projects](#running-the-projects)
- [License](#license)
- [Get in Touch](#get-in-touch)


## Getting Started
To get started with these mini projects, clone the repository to your local machine using the following command:
```bash
git clone https://github.com/Bhabishworgrg/java-mini-projects.git
```


## Projects
### Project 1: Hello World
  This is a simple "Hello, World!" program that demonstrates `variable initialization` and the use of different kinds of `print` statements.

### Project 2: Hello World Again
  A "Hello, World!" program again but it demonstrates how to define `methods` and call them.

### Project 3: Hello World Yet Again
  A "Hello, World!" program yet again but it demonstrates how to separate functionality into different `classes` and create an `object`.
  #### Files:
  - **Driver.java** - The main class that prints the message.
  - **MessageProvider.java** - A class that provides message to print.

### Project 4: Name Greeter
  A program that prompts the user for their name and greets them. This project demonstrates how to `import` classes and take `input`.
  #### Files:
  - **Driver.java** - The main class that greets the user.
  - **NamePrompter.java** - A class that handles prompting and storing of the name.

### Project 5: Integer Input Checker
  A program that prompts the user for an input and checks if it is an integer or not. This project demonstrates the concept of `Exception Handling`.
  #### Files:
  - **Driver.java** - The main class that checks if the input is integer or not.
  - **Printer.java** - A class that handles printing of output.
  - **Prompter.java** - A class that handles prompting of the input.

### Project 6: Integer Type Checker
  A program that prompts the user for an integer and checks if it is positive, negative or zero. This project demonstrates `if` statements and `relational operators`.
  #### Files:
  - **Driver.java** - The main class that checks if the input is integer or not.
  - **OutputPrinter.java** - A class that handles printing of output.
  - **TypeChecker.java** - A class that handles prompting and checking of positive and negative.

### Project 7: Quadratic Equation Solver
  A program that prompts the user for the coefficients of a quadratic equation and prints its roots. This project demonstrates the use of `arithmetic operators` and `arrays`.
  #### Files:
  - **Driver.java** - The main class that prints the roots of the equation.
  - **UserInterface.java** - A class that handles the interface that user interacts with.
  - **Solver.java** - A class that handles calculations to get the roots.

### Project 8: Shape Drawer
  A console-based application that prompts the user for a shape and height, then draws that shape with asterisks. This project demonstrates the use of **for loops**.
  #### Allowed Shapes:
  1. **Diamond**:
  - Draws a diamond shape with asterisks.
  - The size must be a positive odd integer.
  2. **Square**:
  - Draws a square shape with asterisks.
  - The size must be a positive integer.
  #### Files:
  - **Driver.java** - The main class that prompts the user for input and draws the specified shape.
  - **ShapeCreator.java** - A class that draws the specified shape.
  - **ErrorHandler.java** - A class that handles errors in the application.
  - **InvalidHeightException.java** - An exception thrown when an invalid height is encountered.
  - **InvalidShapeException.java** - An exception thrown when an invalid shape is encountered.

## Prerequisites
To run these projects, you need to have the [Java Development Kit (JDK)](https://www.oracle.com/in/java/technologies/downloads/) installed on your machine.

## Running the Projects
- Navigate to the source directory of the project:
```bash
cd java-mini-projects/src
```
- Compile the Java files using the javac command. For example, to run the *Shape Drawer* project:
```bash
javac shapedrawer/*.java
```
- Run the compiled Java program using the java command:
```bash
java shapedrawer.Driver
```
**Note**: Driver class contains the main method and thus is the class to run for every project.

## License
This repository is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

## Get in Touch
Feel free to reach out if you want to collaborate on a project, have a question, or just want to connect!
- LinkedIn: [in/bhabishwor-gurung](https://www.linkedin.com/in/bhabishwor-gurung/)
- Email: [bhabishworgrg@gmail.com](mailto:bhabishworgrg@gmail.com)
