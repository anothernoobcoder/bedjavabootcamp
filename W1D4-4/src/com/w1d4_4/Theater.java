package com.w1d4_4;

public class Theater extends Building {

    @Override
    public void showArea() {
        System.out.println("Theater Area: " + 500*12);
    }

    @Override
    public void showEvents() {
        System.out.println("Events ready to be hosted!!!");
    }
}
