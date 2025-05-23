import java.util.Scanner;

public class oops2joint {

    
    public static double calculateTotalAmount(oops2[] products) {
        double total = 0;
        for (oops2 p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oops2[] products = new oops2[5];

        // Accept 5 products from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product ID, Price, Quantity for product " + (i + 1) + ":");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new oops2(pid, price, quantity);
        }

        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }


        System.out.println("Product ID with the highest price: " + maxPid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}
