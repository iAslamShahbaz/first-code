import java.security.PublicKey;
import java.util.Scanner;
public class add_array {

    public static int[] add (int arr1[], int arr2[])
    {
        int n1= arr1.length;
        int n2=arr2.length;
        int n3=Math.max(n1,n2);
        int res[]= new int[n3];
        int p1=n1-1;
        int p2=n2-1;
        int p3= n3-1;
        int digit=0;
        int carry=0;
        while (p1>=0 || p2>=0)
        {
            int v1= p1>=0 ? arr1[p1]:0;
            int v2= p2>=0 ? arr2[p2]:0;
            int sum= v1+v2+carry;
            digit=sum%10;
            carry=sum/10;
            res[p3]=digit;
            p1--;
            p2--;
            p3--;

        }
        if (carry!=0)
        {
            int newres[]=new int[n3+1];
            newres[0]= carry;
            for (int i=1; i<newres.length; i++)
            {
                newres[i]=res[i-1];
            }
            return newres;
        }
        return res;
    }
    public static void main(String[] args){
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
        int res1[]= add(arr1, arr2);
        for(int val: res1)
        {
            System.out.println(val);
        }
    }
    
}
