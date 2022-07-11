package com.butler.algorithms.caseInsensitive;

//        Write a function that validates whether two strings are identical. Make it case insensitive.
//
//        Examples
//        match("hello", "hELLo") ➞ true
//
//        match("motive", "emotive") ➞ false
//
//        match("venom", "VENOM") ➞ true
//
//        match("mask", "mAskinG") ➞ false

public class Main {

    public static void main(String[] args) {
        String myString = "How Are You";
//        System.out.println(myString.toLowerCase());
        System.out.println(matchStrings("hello", "hELLo"));
    }

    public static boolean matchStrings(String s1, String s2) {      // NOT FUNCTIONING?? toLowerCase seems to work fine?
        String s1LC = s1.toLowerCase();
        String s2LC = s2.toLowerCase();
        if (s1LC == s2LC) {
            return true;
        }
        else
            return false;
    }
}
