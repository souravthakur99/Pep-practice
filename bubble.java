package sorting;
import java.util.*;
public class bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");

        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean swap=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                    
                }
            }
            if(!swap) break;
        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }   
}
//remmeber outer loop n-1 tkk as all elements will be sortedd till n-1
// inner loop n-i-1 as last element will always be greatest so we do not need to compare it