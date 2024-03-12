package test;

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
        System.out.println("Your total for " + product + " is: " + total);
    }

    public static void main(String[] args) {
        String productName = "Rice";
        int qty = 20;
        double productPrice = 5.0d;
        int miles = 10;


        double deliveryCharges = getDeliveryCharge(miles);
        double totalPrice = productPrice * qty + deliveryCharges;
        provideTotal(productName, totalPrice);




    }

}
