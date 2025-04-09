import java.util.*;

public class arrays
{
    public static void main(String[]args)
    {
        ArrayList<Integer> b=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int  min=Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--)
        {
           if(a[i]>min)
           {
            min=a[i];
            c[i]=a[i];
           }
        }
      Arrays.sort(c);
       for(int i=0;i<n;i++)
       {
        System.out.print(c[i]);
       }
    }
}