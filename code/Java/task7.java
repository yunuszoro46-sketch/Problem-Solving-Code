package pkg1;
import java.util.Scanner;
public class task7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int number = scanner.nextInt();

        int sum = 0;
        int temp = Math.abs(number);

    
        while (temp > 0) {
            int digit = temp % 10; 

            if (digit % 2 == 0) {
                sum += digit; 
            }

            temp = temp / 10; 
        }
      
        System.out.println(sum);

        scanner.close();
    }
}
