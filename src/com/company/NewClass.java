package com.company;

import java.util.Scanner;

public class NewClass {
    String shape;
    int numbers;

    private static Scanner scan = new Scanner(System.in);

    public NewClass(String shape, int numbers) {
        this.shape = shape;
        this.numbers = numbers;
    }

    public NewClass newobject(){
        String theshape;
        int thesize;
        System.out.println("Write the shape of your object");
        theshape = scan.nextLine();
        System.out.println("Write its size: ");
        thesize = Integer.parseInt(scan.nextLine());

        NewClass newobject = new NewClass(theshape, thesize);

        return newobject;
    }

    public static String getName(){
        return shape;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}
