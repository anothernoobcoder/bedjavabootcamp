package com.calculator;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    static void mainMenu() {
        System.out.println("Miko's First Java Calculator");
        System.out.println("What do you want to do?");
        System.out.println("0 - Add 2 numbers");
        System.out.println("1 - Subtract 2 numbers");
        System.out.println("2 - Multiply 2 numbers");
        System.out.println("3 - Divide 2 numbers");
        System.out.println("4 - Exit program");

    }

    public static void main(String[] args) {
        boolean exit = false;
        int myChoice = 0;
        while (!exit) {
            mainMenu();
            System.out.println("Type the number of your choice then press Enter");
            myChoice = scanner.nextInt();
            scanner.nextLine();

            switch (myChoice) {
                case 0:
                    System.out.println("Enter your 2 numbers to add");
                    int numberOne = scanner.nextInt();
                    int numberTwo = scanner.nextInt();
                    System.out.println(numberOne + numberTwo);
                    break;
                case 1:
                    System.out.println("Enter your 2 numbers to subtract");
                    int numberThree = scanner.nextInt();
                    int numberFour = scanner.nextInt();
                    System.out.println(numberThree - numberFour);
                    break;
                case 2:
                    System.out.println("Enter your 2 numbers to multiply");
                    int numberFive = scanner.nextInt();
                    int numberSix = scanner.nextInt();
                    System.out.println(numberFive * numberSix);
                    break;
                case 3:
                    System.out.println("Enter your 2 numbers to divide");
                    double numberSeven = scanner.nextInt();
                    double numberEight = scanner.nextInt();
                    System.out.println(numberSeven / numberEight);
                    break;
                case 4:
                    exit = true;
                    break;
                }




            }
        }


    }



