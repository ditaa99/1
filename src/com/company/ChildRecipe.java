package com.company;

public class ChildRecipe extends Recipe{

    int price;

    public ChildRecipe(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
