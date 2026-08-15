
package pkg1;

import java.util.Scanner;

public class LinearSearch {
	
	public static int Search(int[]arr,int target) {
	 	for(int i=0;i<arr.length;i++) {
	 		if(arr[i]==target) {
	 			return i;
	 		}
	 	}
	 	return -1;
}
	
	
public static void main(String[] args) {
	  Scanner scanner=  new Scanner(System.in);
	  int[]nums= {5,10,12,15,16,19};
	  int target;
	  System.out.println("Enter the number you want to find in array: ");
	  target=scanner.nextInt();
	  int result = Search(nums,target);
	  System.out.println("Target: "+target+" Found at index: "+result);
}
}
