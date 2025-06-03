import java.time.*;
import java.util.Scanner;
import java.io.*;

public class AgeCalculator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        String result = "Your age is: " + age.getYears() + " years, " + 
                        age.getMonths() + " months, and " + 
                        age.getDays() + " days.";

        FileWriter writer = new FileWriter("age_output.txt");
        writer.write(result);
        writer.close();

        System.out.println(result); // Optional: Show in console too
    }
}
