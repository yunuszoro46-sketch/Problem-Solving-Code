import java.util.Scanner;
import java.util.Arrays;
public class Reversearray{
         public static void reverse(int[]arr){
             int left=0;
             int  right=arr.length-1;
               while(left<right){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
           
               }
         }

 public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        //array input//
        int nums;
         nums = scanner.nextInt();
         int [] arr = new int[nums];
         for(int i=0;i<nums;i++){
            arr[i]=scanner.nextInt();
         }
      System.out.println("Original: "+Arrays.toString(arr));
           reverse(arr);
       System.out.println("Reversed: "+Arrays.toString(arr));
        scanner.close();
     }
 }
