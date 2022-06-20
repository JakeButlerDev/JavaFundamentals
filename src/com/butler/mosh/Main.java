package com.butler.mosh;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;  // When we use the java.util Date below, IntelliJ auto imports this package

public class Main {     // Classes are named using PascalCase
    public static void main(String[] args) {        // Methods are named using camelCase
        // In Java we have to tell the program what type of data to expect for variables (or fields)
        //int age = 30; //,temperature = 20;   // int is a primitive data type and uses all lowercase
        //int temperature = 20;   // possible to use a comma to declare multiple variables but not standard
        //age = 35;
//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);
//        byte age = 30;
//        int viewsCount = 123_456_789;   // We can use an underscore when we would normally use commas in numbering
//        long viewCount = 3_123_456_789L; // We can use long for integers > 2billion, need to attach the suffix L
//        double price = 10.99;   // This works, but double is more memory than we need
//        float priceA = 10.99F;  // We can use float, but need to attach the suffix F or f
//        char letter = 'A';  // Always use single quotes with char, double quotes are for strings only
//        boolean isEligible = true;
//        Date now = new Date();  // This variable is an instance of the Date class
//        System.out.println(now);
        // We use primitive types to store primitive values but Reference types to store complex objects
        //System.out.println("Hello World");  // Calls the system method, the out field and the print line method

//        byte x = 1;
//        byte y = x;
//        // x and y are completely independent of each other
//        // When assigning with primitive types, the value of y is stored as 1 even if x changes
//        x = 2;
//        System.out.println(y);
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        // With complex objects, the value of point2 is stored as the address of point1 object in memory
//        // That's why these are called reference types, they do not store actual values, they store a reference to an object in memory
//        point1.x = 2;
//        System.out.println(point2);
        // Reference types are copied by their references, primitive types are copied by their value

//        String message = new String("Hello World"); // This is redundant, instead we can just enter:
//        String message = "Hello World;"
//        System.out.println("Hello World"); // Hello World is a string literal, or a string value
//        String message = "Hello World" + "!!"; // We can concatenate using the + operator
        // Because Strings are complex objects, we can use the . operator to access methods to run on them
//        System.out.println(message.replace("!", "*")); // ! and * are arguments we pass into the replace methods
        // In Java, strings are IMMUTABLE. This means we cannot alter them, any method that does will return a NEW string
//        String message = "Hello \"World\""; The backslash character allows us to escape the "" and includes them in our output
        // This is true for \ as well, if we are trying to reach a certain file path c:\Windows\..., we would need to enter it as
        // c:\\Windows\\... to escape each \ we type

        // ARRAYS
        // To declare an array, we use int[] numbers = new int[5];  This array has 5 elements
        // Then we can use numbers[0] = 4, numbers[1] = 73, etc. to fill the array
        // Arrays.toString(numbers)   This is what we call method OVERLOADING
//        If we ran System.out.println(numbers), our output would show the space in memory where numbers[] is stored not the actual array
//        However we can use System.out.println(Arrays.toString(numbers)) to output the contents of our array
        // We can also initialize it as so: int[] numbers = { 4, 5, 17, 20, 1 } In Java, arrays have a fixed size

        // CASTING
        // short x=1;
        // int y = x + 2;
        // Since we are dealing with 2 different data types in x and 2, one must be converted. This is called implicit casting, or automatic casting
        // byte > short > int > long > float > double   Implicit casting happens when there is no data loss
        // If we wanted to explicitly cast, we could write  int y = (int)x + 2;

        // MATH CLASS
        // We can use Math.round() to round a floating number (overloaded method)
        // Math.random() will give us a random floating number between 0 and 1. Math.random() * 100 will give us a number between 0 and 100.
        // Sidenote: We cannot create an instance of an abstract class. One example of this is NumberFormat()
    }
}
