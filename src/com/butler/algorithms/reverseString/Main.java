package com.butler.algorithms.reverseString;

//        Create a method that takes a string as its argument and returns the string in reversed order.
//
//        Examples
//        reverse("Hello World") ➞ "dlroW olleH"
//
//        reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
//
//        reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"

public class Main {

    public static void main(String[] args) {
        // Output to determine functionality
        System.out.println(reverseString("The quick brown fox"));
    }

    public static String reverseString(String myString) {
        // Initialize fields
        char ch;
        String reversedString = "";
        // Loop through passed in string
        for (int i = 0; i < myString.length(); i++) {
            // Character at i of string is extracted from total string
            ch = myString.charAt(i);
            // Extracted character then added to beginning of reversed string
            reversedString = ch + reversedString;
        }
        // Return the newly built reversed string
        return reversedString;
    }
}
