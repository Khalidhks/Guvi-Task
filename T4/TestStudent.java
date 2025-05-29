// Exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class with validations
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name must not contain digits or special characters");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

// Test class with main method
public class TestStudent {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Ravi Kumar", 20, "CSE");
            System.out.println("Student created successfully: " + s1.name);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Student s2 = new Student(2, "Rahul123", 19, "ECE");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Student s3 = new Student(3, "Priya", 22, "IT");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
