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
2. [IDK](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot) 
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
1. Encapsulation = since the interface is pre-defining a part of the behavior of the classes that implement it, as it already has low-level code
2. Polymorphism = although the interface has a part of the behavior defined, it also can be implemented by several classes that defined the behavior
3. Modularity = as it allows defining behaviors by the layers of high-level methods and low-level methods

**Exercise 5**

This exercise was about to explain how does Deque, one of the interfaces collections, works The Deque Interface

Answer: 
Is a double-ended-queue, a linear collection of elements that supports the insertion and removal of elements at both end points. The Deque interface is a richer abstract data type than both Stack and Queue because it implements both stacks and queues at the same time. The Deque interface, defines methods to access the elements at both ends of the Deque instance. Methods are provided to insert, remove, and examine the elements. Predefined classes like *ArrayDeque* and *LinkedList* implement the Deque interface. 
The methods given in the Deque interface are divided into three parts:
Insert: the `addfirst` and `offerFirst` methods insert elements at the beginning of the Deque instance. The methods `addLast` and `offerLast` insert elements at the end of the Deque instance. When the capacity of the Deque instance is restricted, the preferred methods are `offerFirst` and `offerLast` because `addFirst` might fail to throw an exception if it is full.
Remove: the `removeFirst` and `pollFirst` methods remove elements from the beginning of the Deque instance. The `removeLast` and `pollLast` methods remove elements from the end. The methods `pollFirst` and `pollLast` return null if the Deque is empty whereas the methods `removeFirst` and `removeLast` throw an exception if the Deque instance is empty.
Retrieve: the methods `getFirst` and `peekFirst` retrieve the first element of the Deque instance. These methods don’t remove the value from the Deque instance. Similarly, the methods `getLast` and `peekLast` retrieve the last element. The methods `getFirst` and `getLast` throw an exception if the deque instance is empty whereas the methods `peekFirst` and `peekLast` return NULL.

**Exercise 6**

You need to look for two examples to the use of the `Try-catch` statement.
1.	Here, we are trying to divide a number by zero. In this case, an exception occurs. Hence, we have enclosed this code inside the `try` block. When the program encounters this code, *ArithmeticException* occurs. And, the exception is caught by the catch block and executes the code inside the catch block. The catch block is only executed if there exists an exception inside the try block.

**Exercise 6 Output 1**

![Alt text](http://i.imgur.com/1AmDtaz.png?raw=true "JavaHome")

2.	We have used the try block along with the finally block. We can see that the code inside the try block is causing an exception. However, the code inside the `finally` block is executed irrespective of the exception.

**Exercise 6 Output 2**

![Alt text](http://i.imgur.com/BQqZz9h.png?raw=true "JavaHome")

**Exercise 7**

In this exercise you have to simulate a guitar’s catalog and depend on their membership a premium user has access to the premium guitars. Guitars have an id on a data base that make them belong to premium type. Then you have to execute a filter consulting program.

**Exercise 7 Output**

![Alt text](http://i.imgur.com/EZPdazG.png?raw=true "JavaHome")

**Exercise 8**
In this exercise you were asked to map the data base for the amazon viewer project

**Exercise 8 Output**


![Alt text](http://i.imgur.com/xDSDREZ.png?raw=true "JavaHome")

**Exercise 9**

This exercise was about to explain the syntaxis `::` in `forEach(System.out::println)`

Answer:
It is another form of expression that is use for lambda. It is making a reference of the class which I want to execute the method implied.

**Exercise 10**

Which methods use the `StringBuilder` to concatenate.

Answer:
`append` and `insert`

