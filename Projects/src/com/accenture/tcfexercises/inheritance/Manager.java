package com.accenture.tcfexercises.inheritance;

public class Manager extends Employee {
    private int numberReportees;

    public Manager(int id, String eName, String eMail, int vacationDays, int numberReportees) {
        super(id, eName, eMail, vacationDays);
        this.numberReportees = numberReportees;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Reportees: " + numberReportees  );
    }
}

