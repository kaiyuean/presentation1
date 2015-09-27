#Java

<hr>

## Brief Introduction

* Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. 

* It is intended to let application developers "write once, run anywhere" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
 
* Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. 

* The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.

* Java was originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems' Java platform. 

* As of 2015, Java is one of the most popular programming languages in use, particularly for client-server web applications, with a reported 9 million developers. 

<hr>

## Java Program Execution 

![JPE](https://github.com/kaiyuean/presentation1/blob/master/resources/JavaProgramExecution.png)

<hr>

## Object Oriented Programming Concepts

### Constructor

Constructor is a block of code, which runs when you use new keyword in order to instantiate an object.

Rules for creating java constructor: 1. Constructor name must be same as its class name. 2. Constructor must have no explicit return type.

Types of java constructors: 1. Default constructor (no-arg constructor). 2. Parameterized constructor

`Constructor`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Constructor.java)

[Learn more about constructor](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

### Polymorphism

Polymorphism is the capability of a method to do different things based on the object that it is acting upon. In other words, polymorphism allows you define one interface and have multiple implementations.

Different types of polymorphism in java:

* Method Overloading: Define two or more methods of same name in a class, provided that there argument list or parameters are different.

* Method Overriding: Child class has the same method as of base class. In such cases child class overrides the parent class method without even touching the source code of the base class. 

`Method overloading`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/MethodOverload.java)

`Method overriding`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/MethodOverride.java)

[Learn more about polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)

### Inheritance

Inheritance allows a class to use the variables and methods of another class. In other words, the derived class inherits the states and behaviors from the base class. The derived class is also called subclass and the base class is also known as superclass. The derived class can add its own additional variables and methods. These additional variables and methods differentiate the derived class from the base class.

`Inheritance`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Inheritance.java)

[Learn more about inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)

### Encapsulation

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class, therefore it is also known as data hiding.

`Encapsulation`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Encapsulation.java)

[Learn more about encapsulation](http://www.javatpoint.com/encapsulation)

### Static Method & Static Variable

A static method belongs to the class rather than object of a class. A static method can be invoked without the need for creating an instance of a class. Static method can access static data member and can change the value of it.

`Static method`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/StaticMethod.java)

The static variable can be used to refer the common property of all objects (that is not unique for each object). The static variable gets memory only once in class area at the time of class loading.

`Static variable`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/StaticVariable.java)

[Learn more about static method & static variable](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

### Abstract Class & Abstract Method

A class that is declared using “abstract” keyword is known as abstract class. It may or may not include abstract methods which means in abstract class you can have concrete methods (methods with body) as well along with abstract methods ( without an implementation, without braces, and followed by a semicolon). An abstract class can not be instantiated (you are not allowed to create object of Abstract class).

Abstract method has no body and always end the declaration with a semicolon(;). It must be overridden. An abstract class must be extended and in a same way abstract method must be overridden. Abstract method must be in a abstract class.

`Abstract class & method`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/AbstractClassMethod.java)

[Learn more about abstract class & abstract method](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

### Interface

Interface looks like class but it is not a class. An interface can have methods and variables just like the class but the methods declared in interface are by default abstract (only method signature, no body). Also, the variables declared in an interface are public, static and final by default.

`Interface`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Interface.java)

[Learn more about Interface](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)

### Access Modifiers

Determine whether other classes can use a particular field or invoke a particular method. There are two levels of access control: 

At the top level—public, or package-private (no explicit modifier). 

At the member level—public, private, protected, or package-private (no explicit modifier). 

`Access modifiers`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/AccessModifier.java)

[Learn more about access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

### Packages

Packages in Java is a mechanism to encapsulate a group of classes, interfaces and sub packages. Many implementations of Java use a hierarchical file system to manage source and class files. It is easy to organize class files into packages. All we need to do is put related class files in the same directory, give the directory a name that relates to the purpose of the classes, and add a line to the top of each class file that declares the package name, which is the same as the directory name where they reside.

[Learn more about packages](https://docs.oracle.com/javase/tutorial/java/package/packages.html)

### Final

* Final variable: Final variables are nothing but constants. We cannot change the value of a final variable once it is initialized. 
* Final method: A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it.
* Final class: We cannot extend a final class.

`Final`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Final.java)

[Learn more about final](https://docs.oracle.com/javase/tutorial/java/IandI/final.html)

### This

* This keyword can be used to refer current class instance variable.
* This() can be used to invoke current class constructor.
* This keyword can be used to invoke current class method(implicitly).
* This can be passed as an argument in the method call.
* This can be passed as argument in the constructor call.
* This keyword can also be used to return the current class instance.

`This`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/This.java)

[Learn more about this](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)

### Super

* Super.<variable_name> refers to the variable of variable of parent class.
* Super() invokes the constructor of immediate parent class.
* Super.<method_name> refers to the method of parent class.

`Super`[code example](https://github.com/kaiyuean/presentation1/blob/master/src/Super.java)

[Learn more about super](https://docs.oracle.com/javase/tutorial/java/IandI/super.html)

<hr>

## Java vs C++

The syntax of Java is largely derived from C++. Unlike C++, 
* Java does not support operator overloading or multiple inheritance for classes, though multiple inheritance is supported for interfaces. 
* Java has no seperate header-files defining class properties.
* Java does not have pointers, struct, union.
* Java does not allow preprocessor directives or global variables. Every method and variable is defined within a class. 
* All objects are passed by reference
* Java support Multi-threading(Concurrency), Garbage collection, Uses unicode, Interfaces.
* Instead of destructor, Java uses finalize(). 
* Exceptions are similar, but some in Java are required to be caught. 
* There are Strings in JAVA, Represented by the String class 
* Java contains standard libraries for solving specific tasks. C++ relies on non-standard third- party libraries.

<hr>

## Java Predefined Packages

### General Purpose Packages

* java.lang: Boolean, Byte, Character, Class, Complier, String, Thread, Math,etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html)

* java.io: DataInputStream, DataOutputStream, FileInputStream, FileOutputStream,etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html)

* java.nio: Buffer, IntBuffer, ByteBuffer, CharBuffer,etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/nio/package-summary.html)

* java.net: Socket, URL, CookieManager, HttpCookie, etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/net/package-summary.html)

* java.text: Annotation, Format, Normalizer, Collator, etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/text/package-summary.html)

* java.util: Arrays, ArrayList, Date, Calendar, etc.
* [Find more details](http://docs.oracle.com/javase/7/docs/api/java/util/package-summary.html)

### Special Purpose Packages

* java.applet
* java.beans
* java.awt
* etc

<hr>

## Relationship between java and the field of software engineering

The process of software engineering includes requirements, system analysis, system design, code design, testing, deployment, maintenance. Java is one of the most popular programming languages related to the field of code design.

<hr>

## Why software developers care about this topic?

Java is one of the most popular programming languages used to create web applications and platforms. It was designed for flexibility, allowing developers to write code that would run on any machine, regardless of architecture or platform.

Java differs from other programming languages in a couple of significant ways. The following sections describe the most important differences.

### Platform Independence

One of the main reasons Java is so popular is its platform independence, which means that Java programs can be run on many different types of computers. A Java program runs on any computer with a Java Runtime Environment, also known as a JRE, installed. 

### Object Orientation

Java is inherently object-oriented, which means that Java programs are made up of programming elements called objects. Simply put, an object is a programming entity that represents either some real-world object or an abstract concept.

### The Java API

The Java language itself is very simple. However, Java comes with a library of classes that provide commonly used utility functions that most Java programs can't do without. This class library, called the Java API, is as much a part of Java as the language itself. The Java API has several thousand classes — with tens of thousands of methods you can use in your programs.
