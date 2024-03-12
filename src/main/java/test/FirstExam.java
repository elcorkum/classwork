package test;

import java.util.Scanner;

public class FirstExam {

    public static double getDeliveryCharge(int distance) {
        double deliveryCharge = 0.0d;
        if (distance > 0 && distance <= 4) {
            deliveryCharge = 2;
        } else if (distance >= 5 && distance < 16) {
            deliveryCharge = 5.0d;
        } else if (distance >= 16 && distance < 26) {
            deliveryCharge = 10.0d;
        } else if (distance >= 26 && distance <= 50) {
            deliveryCharge = 15.0d;
        } else {
            deliveryCharge = 20.0d;
        }
        return deliveryCharge;
    }
    public static void provideTotal(String product, double total) {
        System.out.println("Your total for " + product + " is: " + total + " .Thank you for your business!");
    }

    public static void main(String[] args) {
        Scanner prodProfile = new Scanner(System.in);
        System.out.println("Which product would you like to purchase?");
        String productName = prodProfile.next();

        System.out.println("How many units would you like to purchase?");
        int qty = prodProfile.nextInt();

        System.out.println("What is the price per unit?");
        double productPrice = prodProfile.nextDouble();

        System.out.println("What is the estimate delivery distance from our shop?");
        int miles = prodProfile.nextInt();


        double deliveryCharges = getDeliveryCharge(miles);
        double totalPrice = productPrice * qty + deliveryCharges;
        provideTotal(productName, totalPrice);




    }

}
