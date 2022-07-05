package com.butler.algorithms.multipleOf100;

//        Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.
//
//        Examples
//        divisible(1) ➞ false
//
//        divisible(1000) ➞ true
//
//        divisible(100) ➞ true

public class Main {
    public static void main(String[] args) {
        // Check output for functionality
        System.out.println(multipleOfHundred(1000));
    }

    public static boolean multipleOfHundred(int number) {   // Define method with param
        // Initialize boolean field
        boolean isMultipleOfHundred;
        // Check conditional if divisible by 100
        if (number % 100 == 0)
            isMultipleOfHundred = true;
        else
            isMultipleOfHundred = false;
        // Return value
        return isMultipleOfHundred;
    }
}
