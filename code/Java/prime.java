package pk1;
import java.util.Scanner;


public class task3 {
  public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int a=scanner.nextInt();
	  int isPrime=0;
	  if(a==1) {
		  isPrime=0;
	  }else if(a==2) {
		  isPrime=1;
	  }else if(a==3) {
		  isPrime=1;
	  }
	  for(int i=2;i<=(a/2);i++) {
		  if(a%i==0) {
			  isPrime=0;
		  }else {
			  isPrime=1;
		  }
	  }
	  
	  if(isPrime==0) {
		  System.out.println("not prime");
	  }else {
		  System.out.println("prime");
	  }
		
}
}
