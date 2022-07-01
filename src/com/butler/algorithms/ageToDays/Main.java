package com.butler.algorithms.ageToDays;

//        Create a function that takes the age in years and returns the age in days.
//
//        Examples
//        calcAge(65) ➞ 23725
//
//        calcAge(0) ➞ 0
//
//        calcAge(20) ➞ 7300

public class Main {

    public static void main(String[] args) {
        // Output to determine functionality
        System.out.println(ageToDays(20));
    }

    public static Integer ageToDays(int ageInYears) {
        // Initialize and define desired field, include computational logic
        int ageInDays = ageInYears * 365;
        // Return age in days
        return ageInDays;
    }
}
