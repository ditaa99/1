package com.company;


import java.util.Scanner;

public class Recipe {

    String name;
    String description;

    Scanner scan = new Scanner(System.in); //getting things from the user

    public Recipe(String name, String description) { //constructor
        this.name = name;
        this.description = description;
    }

    //create new recipe
    public Recipe newRecipe(){
        String productName;
        String productDescription;
        System.out.println("Write the name of the product: ");
        productName = scan.nextLine();
        System.out.println("Write the description of the product: ");
        productDescription = scan.nextLine();

        Recipe recipe = new Recipe(productName, productDescription);
        //recipe = (productName, productDescription);

        return recipe;
    }




    public Recipe(){
        this("Coco", "Tastes very good");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
