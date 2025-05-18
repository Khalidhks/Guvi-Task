import java.util.Scanner;

public class T1Q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a starting integer: ");
        int value = obj.nextInt();

        System.out.print("Enter an ending integer: ");
        int end = obj.nextInt();

        while (value >= end) {
            System.out.println(value);
            value--;
        }

        obj.close();
    }
}