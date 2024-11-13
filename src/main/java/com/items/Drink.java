package com.items;
import com.product.Product;


public class Drink implements Product{
    private String name, flavor;
    private double price;

    @Override
    public double calculatePrice() {
        return 0;
    }
}
