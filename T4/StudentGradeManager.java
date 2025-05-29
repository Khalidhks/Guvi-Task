import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {
    HashMap<String, Integer> studentGrades = new HashMap<>();

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + " added with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();
        Scanner sc = new Scanner(System.in);

        manager.addStudent("Arun", 85);
        manager.addStudent("Sita", 92);
        manager.displayGrade("Sita");
        manager.removeStudent("Arun");
        manager.displayGrade("Arun");

        // Optional: User input example
        System.out.print("Enter student name to add: ");
        String name = sc.nextLine();
        System.out.print("Enter grade: ");
        int grade = sc.nextInt();
        manager.addStudent(name, grade);
    }
}
