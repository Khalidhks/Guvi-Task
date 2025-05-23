public class oops3 {
    private double balance;

    // No-argument constructor: default balance is 0
    public oops3() {
        this.balance = 0;
    }

    // Constructor with initial balance
    public oops3(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
