import java.util.*;
import java.util.stream.*;
import java.io.*;

public class StudentsFilter {
    public static void main(String[] args) throws IOException {
        List<String> students = Arrays.asList("Aman", "Ravi", "Anita", "Bob", "Ajay", 
                                              "Rahul", "Arya", "Sita", "Ansh", "Ramesh");

        List<String> studentsWithA = students.stream()
                                             .filter(name -> name.startsWith("A"))
                                             .collect(Collectors.toList());

        FileWriter writer = new FileWriter("students_with_a_output.txt");
        writer.write("Students with names starting with 'A': " + studentsWithA);
        writer.close();
    }
}
