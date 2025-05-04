import java.util.*;
public class Week1b
{
    public static void main(String []ags)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
        boolean isprime=true;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                isprime=false;
        }
        if(isprime)
            System.out.println(i);
        }
    }
}