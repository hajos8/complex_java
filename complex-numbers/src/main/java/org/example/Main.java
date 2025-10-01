package org.example;

import java.util.Scanner;

public class Main {
    public static boolean isRunningTests = false;
    public static int testOperation;
    public static String test_aStr;
    public static String test_bStr;
    public static String test_zStr;

    public static void main(String[] args) {
        int choice;
        do{
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
            choice = isRunningTests ? testOperation : input.nextInt();
            if(!isRunningTests) input.nextLine();

            switch (choice){
                case 0 -> System.out.println("Exiting the program.");
                case 1 -> {
                    System.out.print("a: ");
                    String aStr = isRunningTests ? test_aStr : input.nextLine();
                    Complex a = new Complex(aStr);

                    System.out.print("b: ");
                    String bStr = isRunningTests ? test_bStr : input.nextLine();
                    Complex b = new Complex(bStr);

                    Complex c = a;
                    c = c.add(b);

                    System.out.println(aStr + " + " + bStr + " = " + c);
                }
                case 2 -> {
                    System.out.print("a: ");
                    String aStr = isRunningTests ? test_aStr : input.nextLine();
                    Complex a = new Complex(aStr);

                    System.out.print("b: ");
                    String bStr = isRunningTests ? test_bStr : input.nextLine();
                    Complex b = new Complex(bStr);

                    Complex c = a;
                    c = c.subtract(b);

                    System.out.println(aStr + " + " + bStr + " = " + c);
                }
                case 3 -> {
                    System.out.print("a: ");
                    String aStr = isRunningTests ? test_aStr : input.nextLine();
                    Complex a = new Complex(aStr);

                    System.out.print("b: ");
                    String bStr = isRunningTests ? test_bStr : input.nextLine();
                    Complex b = new Complex(bStr);

                    Complex c = a;
                    c = c.multiply(b);

                    System.out.println(aStr + " + " + bStr + " = " + c);
                }
                case 4 -> {
                    System.out.print("z: ");
                    String zStr = isRunningTests ? test_zStr : input.nextLine();
                    Complex z = new Complex(zStr);

                    System.out.println("|" + zStr + "| = " + z.abs());
                }
                case 5 -> {
                    System.out.print("z: ");
                    String zStr = isRunningTests ? test_zStr : input.nextLine();
                    Complex z = new Complex(zStr);

                    double arg = z.angle();

                    System.out.println("arg(" + zStr + ") = " + arg);
                }
                default -> System.out.println("Invalid option. Please select a number between 0 and 5.");
            }
        }
        while(choice != 0 && !isRunningTests);




    }
}