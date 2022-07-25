package com.butler.algorithms.hackerSpeak;

//        Create a function that takes a string as an argument and returns a coded (h4ck3r 5p34k) version of the string.
//
//        Examples
//        hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"
//
//        hackerSpeak("programming is fun") ➞ "pr0gr4mm1ng 15 fun"
//
//        hackerSpeak("become a coder") ➞ "b3c0m3 4 c0d3r"

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println(String.valueOf(hackerSpeak("javascript is cool")));
    }

    public static char[] hackerSpeak(String myString) {
        char[] stringArray = myString.toCharArray();
        char[] hackerStringArray = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == 'a') {
                hackerStringArray[i] = '4';
            }
            else if (stringArray[i] == 'e') {
                hackerStringArray[i] = '3';
            } else if (stringArray[i] == 'i') {
                hackerStringArray[i] = '1';
            } else if (stringArray[i] == 'o') {
                hackerStringArray[i] = '0';
            } else if (stringArray[i] == 's') {
                hackerStringArray[i] = '5';
            } else {
                hackerStringArray[i] = stringArray[i];
            }
        }
        return hackerStringArray;

    }
}
