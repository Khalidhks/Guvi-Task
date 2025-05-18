public class T1Q6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
           
            for (int j = 5; j > 5 - i - 1; j--) {
                System.out.print(j);
            }

            
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(5 - i);
            }

            System.out.println(); 
        }
    }
}
