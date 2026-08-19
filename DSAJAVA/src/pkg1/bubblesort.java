package pkg1;
import java.util.Scanner;

public class Bubblesort{
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int array=scanner.nextInt();
		int nums[] = new int[array];
		System.out.println("Enter "+array+" Elements");
		for(int i=0;i<array;i++) {
			nums[i]=scanner.nextInt();
		}
		int temp=0;
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			
		}
		System.out.println("AFTER SORT: ");
		for(int num: nums) {
			System.out.print(num+" ");
		}
	}
}
