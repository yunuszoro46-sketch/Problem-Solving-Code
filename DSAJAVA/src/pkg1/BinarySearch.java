package pkg1;


import java.util.Scanner;

public class BinarySearch {
	
	 public static int Searchh(int[]arr,int target) {
		int left = 0;
		int right =arr.length;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	 }
	
     public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		int[] nums= {5,6,8,9,11,13,7};
		int target;
		System.out.println("Enter the number you want to find the index value of : ");
		target=scanner.nextInt();
		int result = Searchh(nums,target);
		System.out.println("Target: "+target+" Found at index: "+result);
	}
	
	
}
