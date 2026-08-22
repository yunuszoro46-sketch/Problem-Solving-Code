package pkg1;
import java.util.Scanner;


public class Insertionsort {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		    
		    System.out.println("Enter array size : ");
		    int arr =scanner.nextInt();
		    int nums[]=new int[arr];
		    System.out.println("Enter "+arr+" elements: ");
		    for(int i=0;i<arr;i++) {
		    	nums[i]=scanner.nextInt();
		    }
		    for(int i=1;i<nums.length;i++) {
		    	
		    	 int key = nums[i];
		    	 int j=i-1;
		    	 while(j>=0 && nums[j]>key) {
		    		 nums[j+1]=nums[j];
		    		 j--;
		    	 }
		    	 nums[j+1]=key;
		    }
		    System.out.print("sorted elements: ");
		    for(int num:nums) {
		    	System.out.print(num+" ");
		    }
		    
		    
		    scanner.close();
		
	}
   
    
}
