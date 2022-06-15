package com.butler.warmups_6_14.findTheIndex;

public class Main {
    // Create main method
    public static void main(String[] args) {
        // Declare variables for test cases
        int[] numbers = { 17, 9, 4231, 420, 94 };
        int searchFor = 17;
        // Call findTheIndex method
        findTheIndex(numbers, searchFor);
        // Display output to check functionality
        System.out.println(findTheIndex(numbers, searchFor));
    }

    public static int findTheIndex(int[] array, int value) {
        // Declare index within scope
        int index = 0;
        // Run through array, checking if value is within
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                // Break out of loop if value is found
                break;
            }
            else return -1;
        }
        // Return index to main method
        return index;
    }
}
