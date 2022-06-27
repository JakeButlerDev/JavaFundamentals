package com.butler.algorithms.minToSec;

public class Main {
    // Create main method
    public static void main(String[] args) {
        // Declare variable for test case
        int minutes = 5;
        // Call minsToSec function with variable as argument
        minToSec(minutes);
        // Display output to determine functionality
        System.out.println(minToSec(minutes));
    }

    public static int minToSec(int mins) {  // Create method to perform math logic
        int seconds = mins * 60;
        // Return assigned variable as result
        return seconds;
    }
}
