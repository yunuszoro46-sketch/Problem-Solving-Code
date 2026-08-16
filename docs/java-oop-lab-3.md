# Object-Oriented Programming Lab #3 — Spring 25

## Topics

1. Class and Object
2. Constructor

## Objectives

- Define classes and use multiple classes in Java.
- Define and use constructors, attributes, and methods.

---

# Problem 1 — Banking System

Create a Banking System where a user can create a new account, deposit money, withdraw money, and check the balance.

A `BankAccount` is identified by:

- `name`
- `id`
- `balance`

## Requirements

### `BankAccount` class

Create a `BankAccount` class with three instance variables:

```java
name
id
balance
```

Create a constructor that accepts parameters for all three attributes and initializes them.

### Methods

#### `deposit(double depAmount)`

Increase the balance by `depAmount`.

```java
public void deposit(double depAmount)
```

#### `withdraw(double withAmount)`

Decrease the balance by `withAmount`.

The method must ensure that the balance does not become negative.

```java
public void withdraw(double withAmount)
```

#### `getBalance()`

Return the current balance.

```java
public double getBalance()
```

#### `displayInfo()`

Display the account information in the following format:

```text
Name:[name]; Id:[id]; Balance:[balance]
```

## `Bank` class

Create a separate `Bank` class containing the `main` method.

In `main`:

1. Create a `BankAccount` object using the constructor.
2. Store the object reference in a variable named `account`.
3. Call `withdraw(...)`.
4. Call `displayInfo()`.
5. Call `deposit(...)`.
6. Display the balance using `getBalance()`.

---

# Problem 2 — Student Enrolment Record System

Create a Student Enrolment Record System for the **UAP CSE** department.

For this lab, work with one student.

A `Student` is identified by:

- `name`
- `id`
- `enrolledCourse`

The system should be able to:

- Check the enrolled course
- Enroll a course
- Display student information

## Requirements

### `Student` class

Create instance variables:

```java
String name;
String id;
String enrolledCourse;
```

Create a constructor that accepts `name` and `id` and initializes those attributes.

### Methods

#### `enrollCourse(String courseName)`

Assign `courseName` to `enrolledCourse`.

```java
public void enrollCourse(String courseName)
```

#### `displayInfo()`

Display the student's attributes.

## `UapCse` class

Create a separate `UapCse` class containing the `main` method.

In `main`:

1. Create a `Student` object using the constructor.
2. Assign the object to a variable named `st1`.
3. Call `enrollCourse(...)` with `"OOP"`.
4. Call `displayInfo()`.

---

# Problem 3 — Inventory Management System

Create an Inventory Management System for the **UAP Bazar** online store.

For this lab, work with one product.

A `Product` is identified by:

- `name`
- `id`
- `price`
- `discountPercentage`

The system should be able to:

- Keep track of the product
- Check the price
- Update the price
- View product information
- Calculate the discounted price

## Requirements

### `Product` class

Create four instance variables:

```java
name
id
price
discountPercentage
```

Create a constructor that accepts parameters for all four attributes and initializes them.

### Methods

#### `updatePrice(double newPrice)`

Set the product's price to `newPrice`.

```java
public void updatePrice(double newPrice)
```

#### `getPrice()`

Return the current price.

```java
public double getPrice()
```

#### `setDiscountPercentage(double discPercentage)`

Set `discountPercentage` to `discPercentage`.

```java
public void setDiscountPercentage(double discPercentage)
```

#### `getDiscountedPrice()`

Calculate and return the discounted price based on `price` and `discountPercentage`.

```java
public double getDiscountedPrice()
```

#### `displayInfo()`

Display the product attributes.

## `UapBazar` class

Create a separate `UapBazar` class containing the `main` method.

In `main`:

1. Create a `Product` object.
2. Display the price.
3. Update the price using `updatePrice(...)`.
4. Call `displayInfo()`.
5. Call `setDiscountPercentage(...)` with `20`.
6. Call `getDiscountedPrice()` and print the returned value.

---

# Problem 4 — Student Record System

Create a Student Record System for the **UAP CSE** department.

For this lab, work with one student.

A `Student` is identified by:

- `name`
- `id`
- `creditCompleted`
- `cgpa`

The system should be able to:

- Check the student's CGPA
- Update the CGPA
- View student information

## Requirements

### `Student` class

Create four instance variables:

```java
name
id
creditCompleted
cgpa
```

Create a constructor that accepts parameters for all four attributes and initializes them.

### Methods

#### `updateCgpa(double courseCredit, double courseGpa)`

Implement the CGPA update when a student passes a course such as `CSE 201`.

The method should:

1. Calculate the new CGPA using:
   - Current `creditCompleted`
   - Current `cgpa`
   - `courseCredit`
   - `courseGpa`
2. Update `creditCompleted`.

```java
public void updateCgpa(double courseCredit, double courseGpa)
```

#### `displayInfo()`

Display the student's attributes.

## `UapCse` class

Create a separate `UapCse` class containing the `main` method.

In `main`:

1. Create a `Student` object using the constructor.
2. Update the CGPA by calling `updateCgpa(...)`.
3. Call `displayInfo()`.

---

## Core OOP Concepts Covered

This lab focuses on:

- Classes
- Objects
- Constructors
- Instance variables / attributes
- Methods
- Object creation
- Method calls
- Encapsulation of data and behavior
- Basic state updates through methods

## Source

This Markdown version is based on the provided **Object-Oriented Programming Lab #3, Spring 25** handout.
