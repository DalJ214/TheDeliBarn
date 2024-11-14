package com.items;

public class Meat extends Toppings{
    private boolean isExtraMeat;

    public Meat(String name, boolean isExtraMeat) {
        super(name);
        this.isExtraMeat = isExtraMeat;
    }

    // Method to get the price based on the sandwich size and whether it's extra meat
    public double getPrice(String size) {
        double price = 0.0;

        // Standard price based on sandwich size
        switch (size) {
            case "4":
                price = 1.00;
                break;
            case "8":
                price = 2.00;
                break;
            case "12":
                price = 3.00;
                break;
        }


        if (isExtraMeat) {
            switch (size) {
                case "4":
                    price += 0.50;
                    break;
                case "8":
                    price += 1.00;
                    break;
                case "12":
                    price += 1.50;
                    break;
            }
        }

        return price;
    }


    public boolean isExtraMeat() {
        return isExtraMeat;
    }


    public void setExtraMeat(boolean isExtraMeat) {
        this.isExtraMeat = isExtraMeat;
    }

    @Override
    public String getDescription() {
        return "";
    }
}