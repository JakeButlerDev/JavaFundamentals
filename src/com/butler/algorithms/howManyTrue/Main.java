package com.butler.algorithms.howManyTrue;


//        Create a function which returns the number of true values there are in an array.
//
//        Examples
//        countTrue([true, false, false, true, false]) ➞ 2
//
//        countTrue([false, false, false, false]) ➞ 0
//
//        countTrue([]) ➞ 0
//
//        Notes
//        Return 0 if given an empty array.
//        All array items are of the type bool (true or false).

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Boolean> arrayTime = new ArrayList<Boolean>();
        arrayTime.add(true, false, false, true, true);

        System.out.println(countTrue());
    }

    public static Integer countTrue(ArrayList myArr) {
        if (myArr.size() == 0) return 0;

        int trueCounter = 0;
        for (int i = 0; i < myArr.size(); i++) {
            if (myArr.get(i) === true) trueCounter++;
        }
        return trueCounter;
    }
}
