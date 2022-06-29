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

        // READING INPUT
//        Scanner scanner = new Scanner(System.in); `// In parentheses, where are we reading data from? System.in is terminal
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
        // We have implicit casting here, Java will turn age into a string in order to concatenate
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = scanner.nextLine().trim()     //Trim will get rid of any whitespace
//        System.out.println("You are " + name);
        // Every time we call the next method, it reads only 1 token, nextLine will give us the entire line of input

        //CONTROL FLOW
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
        // Java will read left to right, if first statement is false with && it will not even test the other statement
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;    // If first expression was false, Java would continue to evaluate rest of statement
        // We want to write a program that outputs:
        // If temp is greater than 30, "It's a hot day", "Drink plenty of water"
        // Otherwise, if it's between 20 and 30, "It's a nice day"
        // Otherwise, "It's cold"
//        int temp = 32;
//        if(temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink plenty of water");
//        } else if (temp > 20 && temp <=30) {    // We don't really need the second part here, since if it is greater than 30 we already covered that condition
//            System.out.println("Beautiful day");
//        } else {
//            System.out.println("Cold day");
//        }
        // Simplifying IF statements
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);   // We have a boolean expression on the right side, if that equates to true then so does our boolean variable
        // Ternary Operator
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//        This expression reads, if income is greater than 100_000, className = "First", otherwise className = "Economy"
        // Switch statements
//        String role = "admin";
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }     Switch statement let us execute a block of code depending on the value of the expression
        // FOR Loops
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World");      // This code will execute 5 times, evaluating the boolean and running the code below before incrementing
//        }
        // WHILE Loops
//        int i = 0;
//        while (i > 0) {
//            System.out.println("Hello World");
//            i--;
//        }
        // When you know ahead of time how often to repeat a code block, a for loop will function better
        // If we want to run code until a particular condition is met, a while loop will function better
//        String input = "";
//        Scanner scanner = new Scanner(System.in);   // Better to create scanner outside of while loop, otherwise we will create a new instance each time loop runs
////        while (input != "quit") {   // This will not run!! Since our variable is a reference type, it will show the memory location, NOT the value. Instead we use:
//        while (!input.equals("quit")) {
//            System.out.println("Input: ");
//            input = scanner.next();
//            System.out.println(input);
//
//        }     Do.. while loop is the same but gets executed AT LEAST once
//        do {
//            System.out.println("Input: ");
//            input = scanner.next();
//            System.out.println(input);
//        } while (!input.equals("quit"));
        // With while loops, we check the condition first. Do..while loops check the condition after running the code block. Mostly we will use while loops
//        Common technique for while loops:
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;        This break will terminate our loop
//            System.out.println(input);
//        }
        // FOR EACH Loops
//        String[] fruits = { "Apple", "Mango", "Orange"};
//        for (int i=0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        } can be written as:
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }   Limitations of for each loop are, we can move forward only. We cannot access index of each element, only the element itself
    }
}
