package com.items;

import com.product.Product;

import java.util.List;

public class Sandwich implements Product {

    private String size, breadType;
    private boolean toasted;

    List<Toppings> toppings;

    public Sandwich(String size, String breadType, boolean toasted, List<Toppings> toppings) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;

    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 0.0;


        switch (size) {
            case "4":
                basePrice = 5.50;
                break;
            case "8":
                basePrice = 7.00;
                break;
            case "12":
                basePrice = 8.50;
                break;
            default:
                System.out.println("Invalid size! Defaulting to 4\" size.");
                basePrice = 5.50; // Default to 4" if something goes wrong
                break;
        }


        basePrice += toppings.size() * 0.75;

        if (toasted) {
            basePrice += 0.50;
        }

        return basePrice;
    }


    public void printOrderDetails() {
        System.out.println("\n --Your Sandwich Order--");
        System.out.println("Bread Type: " + breadType);
        System.out.println("Size: " + size + "\"");
        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));

        System.out.println("\nToppings:");
        if (toppings != null && !toppings.isEmpty()) {
            for (Toppings toppings1 : toppings) {
                System.out.println(" - " + toppings1.getName());

            }
        } else {
            System.out.println(" - No toppings added.");
        }
        System.out.println("\nTotal Price: $" + calculatePrice());

    }
}