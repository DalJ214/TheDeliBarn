package com.pluralsight;

import com.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderID;

    List<Product> productList;

    public Order(String orderID) {
        this.orderID = orderID;
        this.productList = new ArrayList<>();
    }

    void addItem(Product product){
        productList.add(product);

    }
    void removeItem(Product product){
        productList.remove(product);

    }
    public double calculateTotal(){
        double total = 0.0;
        for (Product product : productList){
            total += product.calculatePrice();
        }
        return total;

    }
    public void printOrderSummary(){
        System.out.println("Order ID: " + orderID);
        System.out.println("Products in Order: ");
        for (Product product : productList){
            System.out.println(" - " + product.getClass().getSimpleName() + ":$" + product.calculatePrice());

        }
        System.out.println("Total Price: $ " + calculateTotal());
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
