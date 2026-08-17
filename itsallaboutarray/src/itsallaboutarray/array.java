package itsallaboutarray;

public class array {
   public static void main(String[] args) {
	int []num= new int[100];
	int total=0;
	int avg;
	int difference;
	for(int i=0;i<num.length;i++) {
		num[i]=1+(int)Math.round((99.0*Math.random()));
		total+=num[i];
		
	}
	System.out.println("Total sum of random numbers: "+total);
	avg=total/num.length;
	System.out.println("Index number of diffrence");
	for(int i=0;i<num.length;i++) {
		difference=num[i]-avg;
		System.out.println("   "+i+"  "+num[i]+"  "+difference+"\n");
	} 
	System.out.println("Average "+"\n"+"is: "+avg);
}   
   
}
