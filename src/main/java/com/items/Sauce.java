package com.items;

public class Sauce extends Toppings{
    private String sauceType;

    public Sauce(String sauceType) {
        super(sauceType);
        this.sauceType = sauceType;
    }




    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }
    @Override
    public String getDescription() {
        return "";
    }
}
