import java.util.Scanner;

public class T1Q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int value = obj.nextInt();

        if (value > 0) {
            System.out.println("The number is positive.");
        } else if (value < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        obj.close();
    }
}
