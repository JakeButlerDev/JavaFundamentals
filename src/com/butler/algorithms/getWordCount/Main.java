package com.butler.algorithms.getWordCount;

public class Main {
    public static void main(String[] args) {
        // Initialize test case string
        String testString = "This is a test";
        // Show output to terminal for testing
        System.out.println(getWordCount(testString));
    }

    public static Integer getWordCount(String myString) {
        // Initialize word count at 1, since first word will not have a space before it
        int wordCount = 1;
        // Turn passed through argument into an array so we can loop through it
        char[] myStringArray = myString.toCharArray();
        // Loop through array
        for (int i = 0; i < myStringArray.length; i++) {
            // Check to see if character is empty space, empty space would suggest a different word
            if (myStringArray[i] == ' ') {
                wordCount++;
            }
        }
        // Return data from method
        return wordCount;
    }
}
