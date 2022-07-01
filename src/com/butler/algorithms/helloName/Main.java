package com.butler.algorithms.helloName;

//        Create a function that takes a name and returns a greeting in the form of a string.
//
//        Examples
//        helloName("Gerald") ➞ "Hello Gerald!"
//
//        helloName("Tiffany") ➞ "Hello Tiffany!"
//
//        helloName("Ed") ➞ "Hello Ed!"

public class Main {

    public static void main(String[] args) {
        // Call method
        helloName("Jake");
    }

    public static void helloName (String name) {
        // Output string concatenated with passed in string
        System.out.println("Hello " + name + "!");
    }
}
