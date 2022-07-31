package com.butler.algorithms.basketballPoints;

//        You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored, find the final points for the team and return that value.
//
//        Examples
//        points(1, 1) ➞ 5
//
//        points(7, 5) ➞ 29
//
//        points(38, 8) ➞ 100

public class Main {

    public static void main(String[] args) {

        // Test output for functionality
        System.out.println(calculateScore(38, 8));
    }

    public static Integer calculateScore(int a, int b) {
        // Calculate points from 2 point shots
        int pointsFromFG = a * 2;
        // Calculate points from 3 pointers
        int pointsFromThreePointers = b * 3;
        // Sum total points
        int totalPoints = pointsFromFG + pointsFromThreePointers;
        // Return total points
        return totalPoints;
    }
}
