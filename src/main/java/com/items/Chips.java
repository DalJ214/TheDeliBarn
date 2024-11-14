package com.items;

import com.product.Product;

public class Chips implements Product {

    private String flavor;
    private double price;

    public Chips(String flavor) {
        this.flavor = flavor;
        this.price = calculatePrice();
    }

    @Override
    public double calculatePrice() {
        return 1.50;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
        this.price = calculatePrice();
    }

    public double getPrice() {
        return price;
    }
}
