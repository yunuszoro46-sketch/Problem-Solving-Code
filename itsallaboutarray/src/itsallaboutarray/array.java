package itsallaboutarray;


import java.util.Scanner;
import java.util.Arrays;
public class array {
	public  static void reverse(int[]arr) {
		  int left = 0;
		  int right = arr.length-1;
		  while(left<right) {
			  int temp=arr[left];
			 arr[left]=arr[right];
			 arr[ right]= temp;
			 left++;
			 right--;
		  }
		
		
	}
	
	
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nums=scanner.nextInt();
    int[] arry = new int [nums];
    
     for(int i=0;i<nums;i++) {
    	arry[i]=scanner.nextInt();
     }
       
           System.out.println("original array  : "+Arrays.toString(arry));
          reverse(arry);
           System.out.println("Reversed array : "+Arrays.toString(arry));
     scanner.close();
}   
   
}
