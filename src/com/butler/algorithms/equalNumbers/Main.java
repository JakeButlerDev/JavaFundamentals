package com.butler.algorithms.equalNumbers;

//        Create a function that returns true when x is equal to y; otherwise return false.
//
//        Examples
//        isSameNum(4, 8) ➞ false
//
//        isSameNum(2, 2) ➞  true
//
//        isSameNum(42, 32) ➞  false

public class Main {

    public static void main(String[] args) {
        // Check output for functionality
        System.out.println(isSameNumber(42, 32));
    }

    public static boolean isSameNumber(int x, int y) {
        // Initialize a boolean to store our result
        boolean isSame;
        // Conditional statement, if numbers are the same set boolean to true
        if (x == y)
            isSame = true;
        // Otherwise set boolean to false
        else
            isSame = false;
        // Return our boolean
        return isSame;
    }
}
