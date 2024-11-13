package com.items;

import com.product.Product;

public class Chips implements Product {

    private String flavor;
    private double price;


    @Override
    public double calculatePrice() {
        return 0;
    }
}
