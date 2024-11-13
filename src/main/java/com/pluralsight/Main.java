package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        boolean run = true;

        while (true) {
            System.out.println("   Home Screen   ");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    startNewOrder(scan);
                    break;
                case 0:
                    System.out.println("Have a good day!Please come back soon! ");
                    run = false;
                    break;
                default:
                    System.out.println("Not a valid option. Please try again.");
            }

        }
        scan.close();
    }
}
private static void startNewOrder(Scanner scanner){
    System.out.println();
}
