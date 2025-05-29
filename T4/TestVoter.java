
// Voter class
class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}

// Test class with main method
public class TestVoter {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(101, "Anil", 20);
            System.out.println("Voter created successfully: " + v1.name);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Voter v2 = new Voter(102, "Kiran", 17);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
