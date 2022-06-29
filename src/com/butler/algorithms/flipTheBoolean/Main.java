package com.butler.algorithms.flipTheBoolean;

public class Main {
    public static void main(String[] args) {
        // Initialize test field
        boolean myBool;
        // Output to determine functionality
        System.out.println(flipTheBool(true));
    }

    public static boolean flipTheBool (boolean myValue) {
        // Conditional logic
        if (myValue == true) {
            myValue = false;
        } else myValue = true;
        // Return value to main()
        return myValue;
    }
}
