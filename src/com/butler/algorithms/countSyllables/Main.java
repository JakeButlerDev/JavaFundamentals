package com.butler.algorithms.countSyllables;

//        Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.
//
//        Examples
//        numberSyllables("buf-fet") ➞ 2
//
//        numberSyllables("beau-ti-ful") ➞ 3
//
//        numberSyllables("mon-u-men-tal") ➞ 4
//
//        numberSyllables("on-o-mat-o-poe-ia") ➞ 6

public class Main {

    public static void main(String[] args) {
        // Check output for functionality
        System.out.println(countSyllables("beau-ti-ful"));
    }

    public static Integer countSyllables(String myString) {
        // Turn string into char array so it is iterable
        char[] myStringArr = myString.toCharArray();
        // Initialize field to keep count of syllables
        int syllables = 0;
        // Increment through array
        for (int i = 0; i < myStringArr.length; i++) {
            // If array element is '-', increase syllable count
            if (myStringArr[i] == '-') {
                syllables++;
            }
        }
        // Increase syllable count because we are using the trigger of '-', which leaves one less syllable than is there
        syllables++;
        // Return result from method
        return syllables;
    }
}
