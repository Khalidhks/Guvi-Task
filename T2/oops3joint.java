public class oops3joint {
    public static void main(String[] args) {
        
        oops3 acc1 = new oops3();
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.displayBalance();

        System.out.println("---------------");

      
        oops3 acc2 = new oops3(2000);
        acc2.deposit(500);
        acc2.withdraw(3000);  
        acc2.displayBalance();
    }
}
