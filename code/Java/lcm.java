package pkg1;

import java.util.Scanner;

public class lcm {
	public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}

    public  static long  lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
        scanner.close();
    }
    
}
	
