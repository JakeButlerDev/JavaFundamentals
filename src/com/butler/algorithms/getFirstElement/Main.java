package com.butler.algorithms.getFirstElement;

public class Main {
    // Create main method
    public static void main(String[] args) {
        // Define array as int[], assign values in same statement
        int[] numbers = { 53, 25, 17, 2, 3421 };
        // Call getFirstElement method and pass numbers array in as argument
        getFirstElement(numbers);
        // Print output to determine functionality
        System.out.println(getFirstElement(numbers));
    }

    public static int getFirstElement (int[] arg) {
        // Return first element of passed in array
        return arg[0];
    }
}
