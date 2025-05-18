import java.util.Scanner;

public class T1Q4 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = obj.nextInt();

        System.out.print("Enter a 2nd number: ");
        int b = obj.nextInt();

        System.out.print("Enter a 3rd number: ");
        int c = obj.nextInt();

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is:" + smallest);

        obj.close();
    }
}
