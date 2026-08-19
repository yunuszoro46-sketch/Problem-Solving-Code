package pkg1;

import java.util.Scanner;

public class factorial{

    
    public static long factorial(int n) {
       
        if (n == 0 || n == 1) {
            return 1;
        }
      
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is only applicable for positive number");
        } else {
            System.out.println(factorial(n));
        }

        scanner.close();
    }
}
