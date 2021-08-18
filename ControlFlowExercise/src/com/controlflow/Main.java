package com.controlflow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int myAge = scanner.nextInt();
        boolean minor;
        boolean adult;
        boolean senior;

        if (myAge >= 18 && myAge < 60) {
           minor = false;
           adult = true;
           senior = false;
        } else if (myAge > 60) {
            minor = false;
            adult = false;
            senior = true;
        } else {
            minor = true;
            adult = false;
            senior = false;
        }

        System.out.println("Minor? " + minor);
        System.out.println("Adult? " + adult);
        System.out.println("Senior? " + senior);

    }
}
