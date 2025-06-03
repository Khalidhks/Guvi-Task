import java.util.*;
import java.util.stream.*;
import java.io.*;

public class NonEmptyStrings {
    public static void main(String[] args) throws IOException {
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abed", "", "jkl");

        List<String> nonEmptyStrings = strings.stream()
                                              .filter(s -> !s.isEmpty())
                                              .collect(Collectors.toList());

        FileWriter writer = new FileWriter("non_empty_output.txt");
        writer.write("Non-Empty Strings: " + nonEmptyStrings);
        writer.close();
    }
}
