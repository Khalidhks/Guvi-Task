
class Person {

    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
        this.age = 18;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class oops1 {
    public static void main(String[] args) {
        Person person1 = new Person("Khalidh");         
        Person person2 = new Person("Aisha", 25);     

        person1.displayInfo();
        System.out.println("-----------");
        person2.displayInfo();
    }
}
