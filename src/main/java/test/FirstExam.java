package test;

public class FirstExam {

    public static double getDeliveryCharge(int distance) {
        double deliveryCharge = 0.0d;
        if (distance > 0 && distance <= 4) {
            deliveryCharge = 2;
        } else if (distance >= 5 && distance < 16) {
            deliveryCharge = 5;
        } else if (distance >= 16 && distance < 26) {
            deliveryCharge = 10;
        } else if (distance >= 26 && distance <= 50) {
            deliveryCharge = 15;
        } else {
            deliveryCharge = 20;
        }
        return deliveryCharge;
    }

    public static void main(String[] args) {
        String productName = "Rice";
        int qty = 20;
        double productPrice = 5.0d;
        int miles = 10;
        double deliveryCharges = getDeliveryCharge(miles);
        double totalPrice = productPrice * qty + deliveryCharges;
        System.out.println(totalPrice);




    }

}
