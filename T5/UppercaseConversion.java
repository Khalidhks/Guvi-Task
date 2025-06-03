import java.util.*;
import java.util.stream.*;
import java.io.*;

public class UppercaseConversion {
    public static void main(String[] args) throws IOException {
        List<String> names = Stream.of("aBc", "d", "ef")
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());

        FileWriter writer = new FileWriter("uppercase_output.txt");
        writer.write("Uppercase List: " + names);
        writer.close();
    }
}
