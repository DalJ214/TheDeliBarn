package com.items;

public class Vegetable extends Toppings{
    private String vegetableType;

    public Vegetable(String vegetableType) {
        super(vegetableType);
        this.vegetableType = vegetableType;
    }



    public String getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(String vegetableType) {
        this.vegetableType = vegetableType;
    }
    @Override
    public String getDescription() {
        return "";
    }
}
