import java.security.PublicKey;
import java.util.Scanner;
public class Rev_array {

    public static int[] rev(int arr[],int low ,int high) {
        
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;

    }
    public static void main(String[] args) { 
        Scanner scn= new Scanner (System.in);
        int k= scn.nextInt();
        int n= scn.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i]=scn.nextInt();
        }
        k=k%arr.length;
        if (k<0)
        {
            k=k+arr.length;
        }
        rev(arr,arr.length-k, arr.length-1);
        rev(arr,0, arr.length-k-1);
        rev(arr,0, arr.length-1);
        int res[] = arr;
        for(int val:res){
            System.out.println(val);
        }

    }    
    
}
