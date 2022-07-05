package com.butler.algorithms.rookAttack;

//        Write a function that returns true if two rooks can attack each other, and false otherwise.
//
//        Examples
//        canCapture(["A8", "E8"]) ➞ true
//
//        canCapture(["A1", "B2"]) ➞ false
//
//        canCapture(["H4", "H3"]) ➞ true
//
//        canCapture(["F5", "C8"]) ➞ false

public class Main {
    public static void main(String[] args) {
        // Output test to determine functionality
        System.out.println(canCapture("A8", "E8"));
    }

    public static boolean canCapture(String rook1, String rook2) {  // Define method with params
        // Turn strings into character arrays
        char[] rook1Arr = rook1.toCharArray();
        char[] rook2Arr = rook2.toCharArray();
        // Initialize boolean field;
        boolean capturable;
        // If elements at same position in array are equal, set boolean to true
        if (rook1Arr[0] == rook2Arr[0] || rook1Arr[1] == rook2Arr[1]) {
            capturable = true;
        }
        else    // Otherwise, boolean is false
            capturable = false;
        // Return boolean
        return capturable;
    }
}
