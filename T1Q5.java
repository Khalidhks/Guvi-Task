import java.util.Scanner;

public class T1Q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = obj.nextDouble();
        double discount = 0;
        double finalAmount;

        if (amount < 500) {
            discount = 0;
        } else if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10; 
        } else if (amount > 1000) {
            discount = amount * 0.20; 
        }

        finalAmount = amount - discount;

        System.out.println("Original amount: " + amount);
        System.out.println("Discount applied: " + discount);
        System.out.println("Amount to pay after discount: " + finalAmount);

        obj.close();
    }
}
