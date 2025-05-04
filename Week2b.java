import java.util.*;
public class Week2b
{
public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total number of names: ");
    int n=sc.nextInt();
    sc.nextLine();
    String a[]=new String[n];
    for(int i=0;i<n;i++)
        a[i]=sc.nextLine();
    String temp;
    for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
            if((a[j].compareTo(a[j+1])>0))
                    {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    }
            }
        }
    for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}