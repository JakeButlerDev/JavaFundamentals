package com.butler.mosh;

import java.util.Date;  // When we use the java.util Date below, IntelliJ auto imports this package

public class Main {     // Classes are named using PascalCase
    public static void main(String[] args) {        // Methods are named using camelCase
        // In Java we have to tell the program what type of data to expect for variables (or fields)
        //int age = 30; //,temperature = 20;   // int is a primitive data type and uses all lowercase
        //int temperature = 20;   // possible to use a comma to declare multiple variables but not standard
        //age = 35;
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
        byte age = 30;
        int viewsCount = 123_456_789;   // We can use an underscore when we would normally use commas in numbering
        long viewCount = 3_123_456_789L; // We can use long for integers > 2billion, need to attach the suffix L
        double price = 10.99;   // This works, but double is more memory than we need
        float priceA = 10.99F;  // We can use float, but need to attach the suffix F or f
        char letter = 'A';  // Always use single quotes with char, double quotes are for strings only
        boolean isEligible = true;
        Date now = new Date();  // This variable is an instance of the Date class
        System.out.println(now);
        //System.out.println("Hello World");  // Calls the system method, the out field and the print line method
    }
}
