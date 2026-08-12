package PKG1;

public class BankAcc{
        public String name,id;
        public double balance;        
public BankAcc(String name,String id,double balance) {
	    this.name=name;
	    this.id=id;
	    this.balance=balance;
}


public void withdraw(double withdraw_amount) {
	  if(this.balance>withdraw_amount) {
		  this.balance-=withdraw_amount;
        		  
	  }else {
		  System.out.println("Insuficiant balance");
	  }
}
public void deposit(double dep_amount) {
	this.balance+=dep_amount;
}
public double getBalance() {
	return balance;
}

public void display() {
	System.out.println("Name: "+this.name+" Account no: "+this.id+" Balance "+this.balance);
}

}
