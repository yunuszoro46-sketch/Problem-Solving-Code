package pkg1;
import java.util.Scanner;
public class test {
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   int number;
	   for(int i=0;i<10;i++) {
		   System.out.println("Enter a number :");
		   number = scanner.nextInt();
	   
		   if ((number % 3 == 0) ^ (number % 5 == 0)) {
			    System.out.println("Valid number: " + number);
			}
		   
		   
	   }
}
}
