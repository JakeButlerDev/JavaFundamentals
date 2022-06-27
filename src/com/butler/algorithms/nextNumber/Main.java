package com.butler.algorithms.nextNumber;

public class Main {
    // Create main method
    public static void main(String[] args) {
        // Define input for test case
        int input = 7;
        // Call nextNumber method to increment value
        nextNumber(input);
        // Display output to check functionality
        System.out.println(nextNumber(input));
    }

    public static int nextNumber(int a) {   // Pass a as argument
        a++;    // Increment value passed through
        return a;   // Return updated value
    }
}
