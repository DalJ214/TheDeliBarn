package com.pluralsight;
import com.items.*;
import com.product.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (true) {
            System.out.println("   Home Screen   ");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
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


        ArrayList<Object> toppings = new ArrayList<>();
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

        System.out.println("Pick a cheese topping (American, Provolone, Cheddar, Swiss) or leave blank for none:");
        String cheeseTopping = scan.nextLine();
        if (!cheeseTopping.isEmpty()) {
            // Asking if they want extra cheese
            System.out.println("Would you like extra cheese for this topping? (yes/no)");
            String extraCheeseInput = scan.nextLine();
            boolean extraCheese = extraCheeseInput.equalsIgnoreCase("yes");


            toppings.add(new Cheese(cheeseTopping, extraCheese));
        }

        System.out.println("Pick a vegetable topping from the following list (or leave blank for none):");
        System.out.println("Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms");
        String vegetableTopping = scan.nextLine();
        if (!vegetableTopping.isEmpty()) {
            toppings.add(new Vegetable(vegetableTopping)); // Add the selected vegetable to the toppings
        }
        System.out.println("Pick a sauce topping from the following list (or leave blank for none): ");
        System.out.println("Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette");
        String sauceTopping = scan.nextLine();
        if (!sauceTopping.isEmpty()) {
            toppings.add(new Sauce(sauceTopping));
        }


        System.out.println("Would ya like it toasted? (yes/no)");
        String toastedInput = scan.nextLine();
        boolean toasted = toastedInput.equalsIgnoreCase("yes");

        // Create the sandwich object
        Sandwich sandwich = new Sandwich(size, breadType, toasted, toppings);

      double totalPrice = sandwich.calculatePrice();
    }

        System.out.println("Would you like to add a drink to your order? (yes/no)");
    String addDrink = scan.nextLine();
    Drink drink = null;

        if(addDrink.equalsIgnoreCase("yes"))

    {
        System.out.println("What size drink would ya like? (Small, Medium, Large)");
        Scanner scan = null;
        String drinkSize = scan.nextLine();

        System.out.println("What flavor would ya like for your drink? (Sweet Tea, Mexican Coke, Strawberry Lemonade, Mr.Pib, Dr.Soda )");
        String drinkFlavor = scan.nextLine();


        drink = new Drink(drinkSize, drinkFlavor);

        totalPrice += drink.getPrice();


        drink.printDrinkDetails();

    }

        System.out.println("Would you like to add chips to your order? (yes/no)");
        String addChips = scan.nextLine();
        Chips chips = null;

        if (addChips.equalsIgnoreCase("yes")) {
            System.out.println("What type of chips would you like? (e.g., Regular, BBQ, Sour Cream)");
        Scanner scan = null;
        String chipType = scan.nextLine();


            chips = new Chips(chipType);

            totalPrice += chips.getPrice();


            chips.printChipsDetails();

        }
        System.out.println("Total Price: $" + totalPrice);

        sandwich.printOrderDetails();



        }


