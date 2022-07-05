 import java.util.Arrays;
import java.util.Scanner;

public class advanced {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(Arrays.toString(arr));
       System.out.println("Enter Kth ");
        int k=sc.nextInt();
        kthElement(arr,k);*/

 
 public static void kthElement(int[]arr,int k){
        int temp=0;
        int r=0;
        int min_val=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[k-1]);
    }
    }
