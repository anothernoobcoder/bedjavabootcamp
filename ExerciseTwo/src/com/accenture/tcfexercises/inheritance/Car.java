package com.accenture.tcfexercises.inheritance;

public class Car extends Vehicle {
    public Car(int doors, int seats, int wheels) {
        super();
        System.out.println("Building a vehicle");
        System.out.println("Building a Car...");
        System.out.println("Number of doors = " + doors);
        System.out.println("Number of seats = " + seats);
        System.out.println("Number of wheels = " + wheels);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
