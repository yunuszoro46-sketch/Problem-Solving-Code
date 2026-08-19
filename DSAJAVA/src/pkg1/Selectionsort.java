package pkg1;
import java.util.Scanner;
public class Selectionsort{
      public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Array size: ");
            int array = scanner.nextInt();
            int nums[]=new int [array];
            System.out.println("Enter "+array+" Elements");
            for(int i=0;i<array;i++){
              nums[i]=scanner.nextInt();
            }
        int temp=0;
        int minIndex=-1;
            for(int i=0;i<nums.length-1;i++){
              minIndex=i;
              for(int j=i+1;j<nums.length;j++){
                  if(nums[minIndex]>nums[j]){
                    minIndex=j;
              }
            }
              temp=nums[minIndex];
              nums[minIndex]=nums[i];
              nums[i]=temp;
            }
        System.out.println("AFTER SORTED: ");
        for(int num : nums) {
          System.out.print(num+" ");
        }
        
 }
}
