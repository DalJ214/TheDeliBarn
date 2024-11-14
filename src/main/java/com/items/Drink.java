package com.items;
import com.product.Product;


public class Drink implements Product {
    private String size, flavor;
    private double price;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
        this.price = calculatePrice();
    }

    @Override
    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                return 0.00;  // Default to 0.00 if size is invalid
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        this.price = calculatePrice(); //making sure to adjust price if the size changes
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public double getPrice(){
        return price;
    }

    public void printDrinkDetails() { //printing details of drink
        System.out.println("Drink: " + size + " " + flavor + " - $" + price);
    }
}