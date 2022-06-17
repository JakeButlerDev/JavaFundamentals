package com.butler.day2;

public class Main {
    public static void main(String[] args) {
        Example myExample = new Example("Bill", 40);
        System.out.println( myExample.getName() );
        System.out.println( myExample.getAge() );

        // Create instance using constructor
        Car myCar = new Car("Chevrolet", 70);

        // Call method to output information
        myCar.getSpeed();
    }
}
