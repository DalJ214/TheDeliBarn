package com.pluralsight;
import com.items.Meat;
import com.items.Sandwich;
import com.product.Product;
import com.items.Toppings;

import java.util.ArrayList;
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
            scan.close();
        }

    }
    private static void startNewOrder(Scanner scan) {
        System.out.println("Alright, let’s get ya a sandwich! Here’s what I need to know.");


        String breadType;
        while (true) {
            System.out.println("What type of bread would ya like? (White, Wheat, Rye, Wrap)");
            breadType = scan.nextLine();
            if (breadType.equalsIgnoreCase("White") || breadType.equalsIgnoreCase("Wheat") || breadType.equalsIgnoreCase("Rye") || breadType.equalsIgnoreCase("Wrap")) {
                break;
            } else {
                System.out.println("That’s not a valid bread type. Try again.");
            }
        }


        String size;
        while (true) {
            System.out.println("What size would ya like? (4, 8, 12)");
            size = scan.nextLine();
            if (size.equals("4") || size.equals("8") || size.equals("12")) {
                break;
            } else {
                System.out.println("That’s not a valid size. Please choose 4, 8, or 12.");
            }
        }


        List<Topping> toppings = new ArrayList<>();
        System.out.println("Pick up to 4 regular toppings (e.g., Lettuce, Tomato, Onion, Pickles, Cheese):");
        for (int i = 0; i < 4; i++) {
            System.out.println("Topping " + (i + 1) + ": (Leave blank if no more toppings)");
            String toppingName = scan.nextLine();
            if (!toppingName.isEmpty()) {
                toppings.add(new Topping(toppingName));
            } else {
                break;
            }
        }


        System.out.println("Pick a meat topping (Steak, Ham, Salami, Roast Beef, Chicken, Bacon) or leave blank for none:");
        String meatTopping = scan.nextLine();
        if (!meatTopping.isEmpty()) {

            System.out.println("Would you like extra meat for this topping? (yes/no)");
            String extraMeatInput = scan.nextLine();
            boolean extraMeat = extraMeatInput.equalsIgnoreCase("yes");

            toppings.add(new Meat(meatTopping, extraMeat));
        }


        System.out.println("Would ya like it toasted? (yes/no)");
        String toastedInput = scan.nextLine();
        boolean toasted = toastedInput.equalsIgnoreCase("yes");

        // Create the sandwich object
        Sandwich sandwich = new Sandwich(size, breadType, toasted, toppings);

        // Print out the details of the order
        sandwich.printOrderDetails();
    }
}