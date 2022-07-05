package com.butler.algorithms.triangleArea;

//        Write a function that takes the base and height of a triangle and return its area.
//
//        Examples
//        triArea(3, 2) ➞ 3
//
//        triArea(7, 4) ➞ 14
//
//        triArea(10, 10) ➞ 50

public class Main {
    public static void main(String[] args) {
        // Check output for functionality
//        triangleArea(7, 4);
        System.out.println(triangleArea(7, 4));
    }

    public static Integer triangleArea(int base, int height) {  // Define function with params
        // Formula for area of a triangle
        int tArea = (base * height) / 2;
        // Return area of triangle
        return tArea;
    }
}
