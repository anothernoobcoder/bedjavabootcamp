package com.bankapp2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = login.nextLine();
        Random random = new Random();
        int id = random.nextInt(100000);
        BankAccount myAccount = new BankAccount(name, id);
        myAccount.mainMenu();


    }
}
