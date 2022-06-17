package com.butler.day2;

public class Car {
    // Create car constructor, declare both fields at start of Class
    private String company;
    private int speed;

    public Car(String company, int speed) {     // Use this. to assign variables to fields
        this.company = company;
        this.speed = speed;
    }

    public void getSpeed() {
        System.out.println(company + " car's speed is " + speed + "Km/hr");
    }
}
