package searching;
import java.util.*;
public class binarysearch {
    public static void main (String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        System.out.println("enter the element to find");
        int key=sc.nextInt();
        while(l<=r){
            int half=(l+r)/2;
            if(arr[half]==key){
                ans=half;
                break;
            }
            else if(arr[half]>key){
                r=half-1;
            }
            else{l=half+1;}

                }
                System.out.println("the answer index is"+ans);
    }
}
