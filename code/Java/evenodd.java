package pk1;
import java.util.Scanner;
public class task2 {
   public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=scanner.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
}
}
