package pkg1;
import java.util.Arrays;
public class Bubblesort {
	 public static void main(String[] args) {
		int nums[]= {7,9,8,4,10,12};
		int temp=0;
		System.out.print(" Before sort: ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		for(int i=0;i<nums.length-i-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	System.out.print(" after sort : ");
	  for(int num:nums) {
		
		   System.out.print(num+ " ");
	  }
		
	}
	 

}
