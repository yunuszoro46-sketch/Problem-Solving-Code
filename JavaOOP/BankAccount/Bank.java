package PKG1;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter your name: ");
	     String name = scanner.nextLine();
	     System.out.println("Enter your ID: ");
	     String id = scanner.nextLine();
	     System.out.println("Enter balance: ");
	     double balance = scanner.nextDouble();
		
		  BankAcc bang = new BankAcc(name,id,balance);
		int option=-1;
		while(option!=0) {
			System.out.println("i. Input ‘1’ to deposit money.\n"
					+ "ii. Input ‘2’ to withdraw money.\n"
					+ "iii. Input ‘3’ to display the balance of the account.\n"
					+ "iv. Input ‘4’ to display the details of the account.\n"
					+ "v. Input ‘0’ to exit the system. ");
			System.out.println("Enter your choice: ");
			option=scanner.nextInt();
			
			switch(option) {
			case 1:
			    System.out.println("Enter the ammount you want to deposit: ");
			    double depo = scanner.nextDouble();
			    bang.deposit(depo);
				break;
			case 2:
				System.out.println("Enter withdraw ammount: ");
				double  with = scanner.nextDouble();
			    bang.withdraw(with);
			    break;
			case 3:
				System.out.println("Balance ammount: "+bang.getBalance());
				
				break;
			case 4:
				System.out.println("account details: ");
				bang.display();
				break;
			case 0:
				System.out.println("Exiting goodbye :) ");
				break;
			 default:
				 System.out.println("invalid");
			}
		}
	}
}
