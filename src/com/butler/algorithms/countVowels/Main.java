package com.butler.algorithms.countVowels;

//Create a function that takes a string and returns the number (count) of vowels contained within it.
//
//        Examples
//        countVowels("Celebration") ➞ 5
//
//        countVowels("Palm") ➞ 1
//
//        countVowels("Prediction") ➞ 4

public class Main {
    public static void main(String[] args) {
        // Output to test functionality
        System.out.println(howManyVowels("Prediction"));
    }

    public static Integer howManyVowels (String myString) {
        // Initialize counter variable
        int vowelCount = 0;
        // Turn passed in string into array, make sure to lowercase all letters for conditional statement ease
        char[] myStringArray = myString.toLowerCase().toCharArray();
        // Loop through new array
        for (int i =0; i < myStringArray.length; i++) {
            // If letter is a vowel, increase counter variable
            if (myStringArray[i] == 'a' || myStringArray[i] == 'e' || myStringArray[i] == 'i' || myStringArray[i] == 'o' || myStringArray[i] == 'u') {
                vowelCount++;
            }
        }
        // Return counter
        return vowelCount;
    }
}
