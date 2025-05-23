package oops;
public class Employee extends Person {
    String employeeID;
    double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); 
        this.employeeID = employeeID;
        this.salary = salary;
    }

   
    public void displayEmployeeInfo() {
        displayPersonInfo(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
