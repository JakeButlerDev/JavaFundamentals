package com.butler.algorithms.existsHigherNum;


//      Write a function that returns true if there exists at least one number that is larger than or equal to n.
//
//        Examples
//        existsHigher([5, 3, 15, 22, 4], 10) ➞ true
//
//        existsHigher([1, 2, 3, 4, 5], 8) ➞ false
//
//        existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
//
//        existsHigher([], 5) ➞ false

public class Main {
    public static void main(String[] args) {
        // Define testing fields
        int[] myArray = { 1, 2, 3, 4, 5};
        // Output to determine functionality
        System.out.println(existsHigher(myArray, 8));
    }

    public static boolean existsHigher(int[] numberList, int givenValue) {  // Define method and parameters
        // Initialize boolean value to false unless test is passed further down code
        boolean doesItExist = false;
        // Loop through array to test each element
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] >= givenValue) {
                // If number is found, no need to test more. Set i = length of array to break from loop
                i = numberList.length;
                doesItExist = true;
            }
            // Otherwise, bool is still false
            else doesItExist = false;
        }
        // Return bool from method
        return doesItExist;
    }
}
