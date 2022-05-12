package com.company;

import java.util.ArrayList;

public class Main {

    public static void printList(ArrayList<NewClass> name) {
        //ArrayList arrayList = name;
        for (NewClass i : name) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
/*
        String name = "Bean";
        String description = "Good";

        Recipe recipe = new Recipe();

        recipe.newRecipe();

        Recipe recipe2 = new Recipe(name,description);

        ArrayList<Recipe> allRecipes = new ArrayList<>();
        allRecipes.add(recipe2);
  */

        String shape = "Circle";
        int numbers = 25;

        NewClass object1 = new NewClass(shape, numbers);
        NewClass object2 = new NewClass("Square", 15);
        NewClass object3 = new NewClass("Triangle", 10);

        ArrayList<NewClass> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);



        printList(objects);

        }




}
