package com.items;

public class Cheese extends Toppings {
    private String type;
    private boolean extraCheese;

    public Cheese(String type, boolean extraCheese) {
        super(type);
        this.type = type;
        this.extraCheese = extraCheese;
    }

    // Method to get the price of cheese based on size
    public double getPrice(String size) {
        double price = 0.0;


        switch (size) {
            case "4":
                price = 0.75;
                break;
            case "8":
                price = 1.50;
                break;
            case "12":
                price = 2.25;
                break;
        }


        if (extraCheese) {
            switch (size) {
                case "4":
                    price += 0.30;
                    break;
                case "8":
                    price += 0.60;
                    break;
                case "12":
                    price += 0.90;
                    break;
            }
        }

        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String getDescription() {
        return "";
    }
}