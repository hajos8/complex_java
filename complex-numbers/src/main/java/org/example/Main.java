package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("--------------------");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a * b");
        System.out.println("4. |z|");
        System.out.println("5. arg(z)");
        System.out.println("0. Exit");

        System.out.println("--------------------");
        System.out.print("Select an option (0-5):");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice){
            case 0 -> System.out.println("Exiting the program.");
            case 1 -> {
                System.out.print("a: ");
                String aStr = input.nextLine();
                Complex a = new Complex(aStr);

                System.out.print("b: ");
                String bStr = input.nextLine();
                Complex b = new Complex(bStr);

                Complex c = a;
                c = c.add(b);

                System.out.println(aStr + " + " + bStr + " = " + c);
            }
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            default -> System.out.println("Invalid option. Please select a number between 0 and 5.");
        }


    }
}