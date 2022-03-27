import java.security.PublicKey;
import java.util.Scanner;
public class subtract_array {
    public static void sub(int arr1[], int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int n3= Math.max(n1,n2);
        int arr3[]= new int[n3];
        int p1=n1-1;
        int p2=n2-1;
        int p3=n3-1;
        int carry=0;
        int digit=0;
        while(p3>=0)
        {
            int v1= p1>=0?arr1[p1]:0;
            if (arr2[p2]+ carry >=v1)
            {
                digit=arr2[p2]+carry-v1;
                carry=0;
            }
            else
            {
                digit=arr2[p2]+carry +10-v1;
                carry=-1;
            }
            arr3[p3]=digit;
            p1--;
            p2--;
            p3--;
        }
        int i=0;
        while (i<arr3.length)
        {
            if (arr3[i]==0)
            {
                i++;
            }
            else
            {
                break;
            }
        }
        while (i< arr3.length)
        {
            System.out.println(arr3[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n1= scn.nextInt();
        int arr1[]= new int[n1];
        for (int i=0; i<n1; i++)
        {
            arr1[i]=scn.nextInt();
        }
        int n2= scn.nextInt();
        int arr2[]= new int[n2];
        for (int i=0; i<n2; i++)
        {
            arr2[i]=scn.nextInt();
        }
        sub(arr1,arr2);
    }
    
    
}
