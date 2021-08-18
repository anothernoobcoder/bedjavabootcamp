package com.accenture.tcfexercises.inheritance;

public class Vehicle {
    private int doors;
    private int seats;
    private int wheels;

    public Vehicle(int doors, int seats, int wheels) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        System.out.println("Building a vehicle");
        System.out.println("Number of doors = " + doors);
        System.out.println("Number of seats = " + seats);
        System.out.println("Number of wheels = " + wheels);
    }

    public Vehicle() {
    }

    public void drive () {
        System.out.println("Driving a vehicle...");
    }

    

}
