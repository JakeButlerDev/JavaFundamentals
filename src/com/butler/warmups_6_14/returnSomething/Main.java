package com.butler.warmups_6_14.returnSomething;

public class Main {
    public static void main(String[] args) {
        String a = "something darkside";
        giveMeSomething(a);
        System.out.println(giveMeSomething(a));
    }

    public static String giveMeSomething(String a) {
        String newString = "something " + a;
        return newString;
    }
}
