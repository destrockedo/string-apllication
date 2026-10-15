package com.pluralsight;
//Step 3
public class Receipt {
    public static void main(String[] args) {
        String item = "steak";
        double price = 15.50;
        int quantity = 3;
        System.out.println("You bought " + quantity + " " + item + " for $" + (price * quantity));
    }
}
