package com.modulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is your number a multiple of 3 or 5?");
        System.out.println("Enter your number: ");
        int myMultiple = scanner.nextInt();

        if (myMultiple % 3 == 0) {
            System.out.println(myMultiple + " is a multiple of 3");
        } else if (myMultiple % 5 == 0){
            System.out.println(myMultiple + " is a multiple of 5");
        } else {
            System.out.println(myMultiple + " is not a multiple of 3 or 5");
        }

        scanner.close();
    }
}
