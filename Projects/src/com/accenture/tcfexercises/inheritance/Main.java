package com.accenture.tcfexercises.inheritance;

public class Main {

    public static void main(String[] args) {
        Employee joeBee = new Employee(157438, "Joe Bee", "joe.bee@accenture.com", 2);
        Manager johnPeter = new Manager(101234, "John Peter", "john.peter@accenture.com", 3, 10);

        joeBee.printDetails();
        System.out.println();
        johnPeter.printDetails();

    }
}


