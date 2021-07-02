# JAVA Academy: Java Avanzado SE (Standar Edition)

## Introduction

In this course object-oriented programming topics were applied to classes and interfaces. Functional interface and abstract class was defined and used. We also learned how to implement lambdas and its function and program applications through the new interface access modifiers as default or private, acording to a modular programing.

## Getting Started

1. Clone this repository
2. Go download two versions of [IDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot). Version 9
3. Go download [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows) 
4. Follow the instruction for each challenge

## Dependencies

1. Terminal of your choice
2. [IDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot) version 11
3. [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows)

## Instructions

**Exercise 1**

This exercise was about a program that draws figures automatically. It has an abstract class called Figure, and a method called draw(). The problem was, what would you have to do so that the Triangle class can override this method and put the code that makes it draw the indicated shape?

1. In your terminal go to the JavaAvanzado-MMA directory with the command `cd JavaAvanzado-MMA/`
2. Open the file *Figure.java* with the command `code Figure.java`
3. You also can open the file *Figure.java* from this repository 


**Exercise 1 Output**

![Alt text](http://i.imgur.com/Jh7PXFF.png?raw=true "JavaHome")

**Exercise 2**

This exercise ask you use the tags for the documentation of the Report library

1. You can open the file *Report.java* inside this directory *JavaAvanzado-MMA\AmazonViewer\src\amazonviewer\makereport\Report.java*


**Exercise 2 Output**

![Alt text](http://i.imgur.com/3CUUY5G.png?raw=true "JavaHome")

**Exercise 3**

In this exercise we demonstrate how to implement nesting classes in a Java program about the relation ship between Album - Song  where Song will be a class that is only used in Album since the definition of this is a collection of Song’s

1. In your terminal go to the JavaAvanzado-MMA directory with the command `cd JavaAvanzado-MMA/`
2. Open the file *Album.java* with the command `code Album.java`
3. You also can open the file *Album.java* from this repository 


**Exercise 3 Output**

![Alt text](http://i.imgur.com/i6OTwg2.png?raw=true "JavaHome")

**Exercise 4**

In this exercise we have a project in which there is an API of methods that manipulate the behavior of a Robot. The code that generates the connection is lower-level and encapsulated in an interface. This is only available to be called within the interface. There are also higher-level methods that define the behavior of the robot and are available to be called from where an instance / object of it is being generated. The question is: What are the concepts that we are applying when having available layers and others not available in my project?

Answer: 
1. Encapsulation = since the interface is pre-defining a part of the behavior of the classes that implement it, as it already has low-level code.
2. Polymorphism = although the interface has a part of the behavior defined, it also can be implemented by several classes that defined the behavior.
3. Modularity = as it allows defining behaviors by the layers of high-level methods and low-level methods.
