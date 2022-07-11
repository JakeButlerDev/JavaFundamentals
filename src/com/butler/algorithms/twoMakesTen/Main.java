package com.butler.algorithms.twoMakesTen;

//        Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
//
//        Examples
//        makesTen(9, 10) ➞ true
//
//        makesTen(9, 9) ➞ false
//
//        makesTen(1, 9) ➞ true

public class Main {

    public static void main(String[] args) {
        // Output to check functionality
        System.out.println(twoMakesTen(9, 0));
    }

    public static boolean twoMakesTen(int a, int b) {   // Define function with params
        // If sum of integers equals 10, return true
        if (a + b == 10)
            return true;
        // OR if one of two integers is 10, return true
        else if (a == 10 || b == 10)
            return true;
        // Otherwise return false
        else
            return false;
    }
}
