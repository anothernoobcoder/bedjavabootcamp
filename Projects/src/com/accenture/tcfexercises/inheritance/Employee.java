package com.accenture.tcfexercises.inheritance;

public class Employee {
    private int Id;
    private String eName;
    private String eMail;
    private int vacationDays;

    public Employee(int id, String eName, String eMail, int vacationDays) {
        Id = id;
        this.eName = eName;
        this.eMail = eMail;
        this.vacationDays = vacationDays;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Name: " + eName);
        System.out.println("E-mail: " + eMail);
        System.out.println("Vacation Days: " + vacationDays);
    }
}



