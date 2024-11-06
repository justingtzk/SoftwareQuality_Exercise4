<!--
SPDX-FileCopyrightText: 2024 Justin Getzke

SPDX-License-Identifier: MIT
-->

# Software Quality - Exercise 4

This repository contains a Java-based software project developed for a university course on Software Quality. The project includes implementations and tests for computing the greatest common divisor (GCD) and a stack data structure. It uses Maven for project management and dependency resolution.

## Project Structure

The project comprises the following primary files:

- **MyMaths.java**: Contains a method to compute the greatest common divisor (GCD) of two integers.
- **Stack.java**: Implements a basic stack data structure.
- **MyMathTest.java**: JUnit test cases for the `MyMaths` class.
- **StackTest.java**: JUnit test cases for the `Stack` class.
- **pom.xml**: Maven configuration file for managing dependencies and project setup.

## Getting Started

### Prerequisites

- **Java JDK 23**: Ensure you have Java 23 installed, as specified in `pom.xml`.
- **Maven**: This project uses Maven for dependency management. Install it if you haven’t already.

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/justingtzk/SoftwareQuality_Exercise4.git
   cd SoftwareQuality_Exercise4
   ```

2. **Build the Project**
   Use Maven to compile the source files:
   ```bash
   mvn compile
   ```

3. **Run the Tests**
   Execute the JUnit tests to verify the functionality:
   ```bash
   mvn test
   ```

## Project Details

### MyMaths Class

The `MyMaths` class provides a method to calculate the greatest common divisor (GCD) of two integers, which is useful for finding the largest integer that divides both numbers without a remainder.

- **Method**: `gcd(int a, int b)`
  - Computes the GCD of two integers using the Euclidean algorithm.
  - Returns the GCD as an integer.

Refer to `MyMathTest.java` for example test cases validating the functionality of this method.

### Stack Class

The `Stack` class is a simple implementation of the stack data structure, supporting typical stack operations:

- **push**: Adds an element to the top of the stack.
- **pop**: Removes the top element from the stack.
- **top**: Returns the top element without removing it.
- **isEmpty**: Checks if the stack is empty.
- **size**: Returns the number of elements in the stack.

The `StackTest` class includes tests to validate the functionality of each stack operation.

## Testing

This project uses **JUnit 5** for testing. All tests are located in the `src/test` directory. You can run these tests through Maven as shown above, or directly through your IDE if it supports JUnit.

## Dependencies

The project dependencies are managed through Maven and are specified in `pom.xml`. Key dependencies include:

- **JUnit 5**: For unit testing (`junit-jupiter-engine`, `junit-vintage-engine`).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSES/MIT.txt) file for details.