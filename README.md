# Learning Java with Projects

![Static Badge](https://img.shields.io/badge/Core%20Java-Bootcamp-blue)


Programming is like riding a bike; you can read about how to do it all day, but the best way to get started is to practice.

Java is a great first programming language because it has a broad feature set and is used in a variety of applications, including desktop applications, Android apps, and iOS app development. Java is also in high demand, with [40 percent of respondents in Stack Overflow’s 2020 Developer Survey](https://insights.stackoverflow.com/survey/2020#most-popular-technologies) claiming to use the language.  
<br/>

![Java applications](https://i.ibb.co/chYhgGj/uses-of-Java.jpg "Java applications")

Source: TatvaSoft

Learning to code in Java can help you get started in a variety of applicable fields, as depicted in the picture. Many of these opportunities are both lucrative and promising in their long-term job security. For example, software developers are projected to see 22 percent job growth by 2029, which is much higher than the average job growth projected for most fields.


## Yet another bootcamp

One great way to seize this opportunity is to enroll in a **coding bootcamp**. This can provide you with a broad set of coding-related skills in a relatively short time frame, offering an introduction to crucial skills through hands-on, project-based learning. Bootcamps are also accessible to a variety of prior experience levels — everyone from career upskillers to complete beginners.

When learning to code, it's important to have help available when you need it. We therefore pick an excellent and very experienced corporate instructor for learning Core Java while simultaneously honing our time management and accountability skills.

## Before getting started

Now, before we immerse ourselves into writing code here's a few things you should know about Java:
**Java is a portable, secure, robust, compiled, object-oriented, and platform-independent programming language.** This means it can run on any machine, regardless of what operating system is used.

### What is programming?
Computer programming refers to the detail or steps of instructions given to a computer in an appropriate computer language, which enable the computer to perform a variety of tasks in sequence. A set of instructions written in a computer language is typically called a program or code.

### Java Virtual Machine
JVM stands for Java Virtual Machine. It is our smallest unit. When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

### Java Runtime Environment
JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications. If you need to run Java programs, but not develop them, JRE is what you need.

### Java Development Kit
JDK stands for Java Development Kit. It refers to all the standard libraries used in programming the software and a number of development tools (compilers, JavaDoc, Java Debugger, etc). When you download JDK, JRE is also downloaded with it.  
<br/>

![JDK-JRE-JVM](https://i.ibb.co/MZp6Dj8/JDK-JRE-JVM.png "JDK-JRE-JVM")

Source: GeeksforGeeks

## Projects

For our projects we need [Java](https://www.java.com/download/ie_manual.jsp) and once this is in your system, we'll need an editor, [Eclipse](https://www.eclipse.org/downloads/).

The projects in our list are assignments focusing on different skills in **Core Java** needed to build out a well-rounded Java skill set; progressing in difficulty as the list continues.


1. [Introduction](https://github.com/ajitagupta/core-java-projects/blob/main/Book.java)
2. [Looping](https://github.com/ajitagupta/core-java-projects/blob/main/Employee.java)
3. [Arrays and Strings](https://github.com/ajitagupta/core-java-projects/blob/main/VowelsConsonants.java)
4. [Object-Oriented Programming](https://github.com/ajitagupta/core-java-projects/blob/main/BankingApp.java)
5. [Constructor](https://github.com/ajitagupta/core-java-projects/blob/main/Parent.java)
6. [Abstract Classes and Interfaces](https://github.com/ajitagupta/core-java-projects/blob/main/Parent.java)
7. [Exceptions](https://github.com/ajitagupta/core-java-projects/blob/main/ThrowPositiveException)
8. [Multithreading](https://github.com/ajitagupta/core-java-projects/blob/main/RunnableTest.java)
9. [Java 8 Features](https://github.com/ajitagupta/core-java-projects/blob/main/README.md#9-java-8-features)
10. [Collections](https://github.com/ajitagupta/core-java-projects/blob/main/EmployeeCRUDAPI.java)

## 1. Introduction
In our first two classes we cover the concepts class, data types, Wrapper classes, variable types (static, local, instance), arithmetics, and the Scanner class.

`Book.java` is the corresponding assignment. 

Here, we create a `Book` class, which asks the user for three inputs: `book name, author name, publish status`, and then prints those values sequentially to the console.

![Book Class](https://i.ibb.co/JrTWX3S/Book-Class.png "Book Class")

## 2. Looping

Looping consists of a) decision-making constructs (if, ladder if else, switch) since they make logical decisions (true/false) based on the conditions provided, and b) conditional statements, which are the executable block of code (or branch to a specific code) dependent on certain conditions (while, do_while, for).

`Employee.java` is the corresponding assignment. 

Here, the user is supposed to enter his name, daily salary, and number of office attending-days that month. His monthly salary is calculated and used to justify to him his job designation.

![Employee Class](https://i.ibb.co/Ch9rpCm/Employee-Class.png "Employee Class")

## 3. Arrays and Strings

In this class we tackle a common interview question: Counting the number of vowels and consonants in a string array specified by the user.

`VowelsConsonants.java` contains the solution and here is a demo output:

![VowelsConsonants Class](https://i.ibb.co/4dTgNrb/Vowel-Constants-Class.png "VowelsConsonants Class")

## 4. Object-Oriented Programming

The purpose of OOP is to improve code readability and reusability. Data is accessed and controlled. Code is modified and maintained. All this is easier with object-oriented programming.

The four pillars of OOP are a) inheritance, b) polymorphism, c) encapsulation, and d) abstraction.

A class stands at the heart of OOP. It is a blueprint of an object, and an object is an instance or a copy of a class. An object is also a runtime entity with an identity, state, and behavior - all described by methods and variables. It is initialized using the `new` keyword.

### Inheritance

Single, multi-level/chained, hierarchical, and hybrid (mix of first 3) inheritance. Class can access properties of another class. First class is called parent-/base-/superclass, second is called child-/derived-/subclass. Implemented using `extends` keyword. Multiple inheritance not supported.  
<br/>

![Inheritance](https://i.ibb.co/ChxyfNW/inheritance-drawio.png "Inheritance")

### Polymorphism

One name, many forms (poly: many, morphism: behavior). One function can have multiple behaviors. Ways: a) function overloading/compile-time overloading: same name, different parameters, b) function overriding/runtime-/dynamic polymorphism / dynamic method dispatch: same name, same parameters (signature) / one reference (not object) for all subtypes, same method called on all, type of object being referred at time of call.

### Encapsulation
Wrapping and binding of data in single unit. Variables declared in class with `private` keyword. Variables accessed with getters and setters. Methods inside the class.

### Abstraction

Hiding implementation details of the code and exposing only necessary information to the user (example: ATM machine). Declared using `abstract` keyword. If method is abstract class must also be abstract. Class can't be instantiated, only extended in a child class.

### Larger Project: Banking System

Now let's have a look at a menu-driven banking application: `BankingApp.java`.

The user must input his bank information. Then, a menu appears:

![BankingApp1](https://i.ibb.co/gV4h78L/Banking-App1.png "BankingApp1")

After picking an option the instruction is carried out until the loop exits (Option 5):

![BankingApp2](https://i.ibb.co/9yr7v2X/Banking-App2.png "BankingApp2")

## 5. Constructor

Special type of method which is used to initialize/create an object. Rules: 1) constructor and class name should be the same, 2) constructor doesn't contain return type, 3) constructor cannot be abstract, static or final. Types: 1) default, 2) parameterized. A constructor cannot be overridden, but it can be overloaded.

Watch this overloaded constructor in `Student.java`:

![Overloading Constructor](https://i.ibb.co/BCT1w6Z/Student-java.png "Overloading Constructor")

## 6. Abstract Classes and Interfaces

An abstract class must be declared with the `abstract` keyword. It can have abstract and non-abstract methods. It can't be instantiated. It can have constructors and static or final methods. If you want to declare a method as abstract the class must also be abstract.

Interfaces are used to achieve multiple inheritance in Java - at a time you can extend multiple classes. An interface object cannot be created. An interface is defined by the `interface` keyword. By default, interface methods are abstract. A class to interface relationship is defined by `implements`. An interface to interface relationship is defined by `extends`.

An example of the two is provided in `Parent.java`. Here is the output:

![Abstract Classes & Interfaces](https://i.ibb.co/T8bszB7/Parent-java.png "Abstract Classes & Interfaces")

## 7. Exceptions

An exception is an error from which can be recovered. An error is an unavoidable runtime situation from which we can't recover. Exceptions can be checked/compile-time and unchecked/runtime exception.

![Exception Types](https://i.ibb.co/Sw5qxzR/exceptions.jpg "Exception Types")

To recover from exceptions we can make use of `try-catch`, `throw/throws`, or `finally` blocks. We can handle exceptions with multiple catch-blocks. The finally-block code executes at any cost. [See how throw and throws keywords work](https://www.c-sharpcorner.com/UploadFile/3614a6/throw-and-throws-in-java/).

In `ThrowPositiveException.java` we see an example of a user-defined exception:

![User-defined Exception](https://i.ibb.co/b15wRr5/Throw-Positive-Exception.png "User-defined Exception")


## 8. Multithreading

A thread is a process / execution of a program. A thread gets created by extending the `Thread` class or by implementing `Runnable` interface, the latter allowing for more flexibility (multiple inheritance).

To execute the thread we use the `start` method, which automatically calls the Thread class' `run` method.

If multiple processes are running simultaneously there will be interleaving. To avoid this 

### a) JOIN
one of them must provide waiting time with the `join` method.

`RunnableTest.java` is an example of calling the 10's table from two different threads.

![RunnableTest.java](https://i.ibb.co/NZXMLmv/Runnable-Test-java.png "RunnableTest.java")

### b) Synchronization
one can use synchronization. Synchronization locks an object. This is used in booking systems, e.g. seat-booking in railways. There are synchronized methods and synchronized blocks available, each marked with the keyword `synchronized`. We use them for proper execution (with locks) of code.

## 9. Java 8 Features

The significant reason for introducing Java 8 was to introduce conciseness in the code. It now has a few concepts of functional programming now, e.g. Lambda expressions.

### Lambda Expressions
Lambda is an anonymous function, i.e. it doesn't require a name, return type, access modifier - just the body. In lambda expressions a method is created by reference with operator and body - no function name or object is required.

Lambda expressions do not support normal interface but functional interfaces only.

Method expressions are replacements of lambda expressions. They are used to refer method of the functional interface to an existing method, mainly for code reusability. There are three types: a) We reference the method using object of the class, b) we use the static method with `::` or we use a c) constructor.

### Functional Interface
A functional interface contains only one single abstract method (SAM) (but any number of static and default methods). It takes as annotation `@FunctionalInterface` to create it. Important in-built example: `Runnable`.

A functional interface depends on lambda expressions to be executed. It provides reference to lambda expressions (relationship). To call the expression we need a functional interface.

A consumer is a predefined function interface containing only a single argument. Interface and methods are not required. accept is the in-built method used to call the consumer operation with a parameter returning nothing.

A biconsumer works similarly, but with the difference that it can take two arguments.

Java has no in-built functional interfaces that can take 3 arguments or more.

### Stream API
If you want to process bulk objects of collection then you should go for Streams concept. Streams is a special iterator class that allows processing collections of objects in a functional manner, e.g. fetch all objects from list whose value is greater than 15.

Multiple lines of code are reduced to one line of code with streams.

Allowed operations: filter (reduces number of objects), map (performs operation and creates another object for each object), reduce, count, limit, foreach

### Default and Static Methods
When you mark an interface method as default you can add its body.

This playlist is recommended for [further reading](https://www.youtube.com/watch?v=oUdENE7ljjw&list=PLyHJZXNdCXsdeusn4OM33415DCMQ6sUKy).

Example: `DefaultMaths.java`

## 10. Collections

The Collections framework provides unified architecture for manipulating and representing collections. A well designed framework can improve your productivity and provide ease of maintenance.

The Collections framework is contained in `java.util` package. It can perform following activity: a) Add objects to collection, b) Remove objects from collection, c) Search for an object in collection and d) Retrieve/get object from collection.

Collection framework contains different types of collections such as lists (unordered collection of data, duplicate data allowed, index starts from 0), sets (unordered collection of data, duplication not allowed), maps (key-value pair, duplication not allowed), stacks, queues, etc.

In an Arraylist the memory is dynamically located contiguously at the end. In a LinkedList your element can be added anywhere in the list, specified by the index.

![Collections](https://i.ibb.co/fHfz1gq/Collections.png "Collections")

Source: EduBridge

We provide an input-based arraylist example inside `UserDefinedArrayList.java`.

![UserDefinedArrayList Class](https://i.ibb.co/CB8LMHt/User-Defined-Array-List-java.png "UserDefinedArrayList Class")

### Larger Project: Employee CRUD API

Now let's for a change have a look at a menu-driven Employee CRUD application: `EmployeeCRUDAPI.java`.

The user can add, delete, search for and display employee information. First, a menu appears:

![EmployeeCRUD1](https://i.ibb.co/J3HVSY4/Employee-CRUD1.png "EmployeeCRUD1")

After picking an option the instruction is carried out (Option 1, 2, 3 or 4) until the loop exits (user input = 0):

![EmployeeCRUD2](https://i.ibb.co/RQ93jcs/Employee-CRUD2.png "EmployeeCRUD2")

## License
![Public Domain](https://i.ibb.co/74t3hCb/public-domain.png "Public Domain")

To the extent possible under law, Ajita Gupta has waived all copyright and related or neighboring rights to this work.
