import java.util.*;
public class Week1a
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a,b,c value:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double f=b*b-4*a*c;
        if(f<0)
        System.out.print("No real roota");
        else{
        double d=Math.sqrt(f);
        double x=(-b-d)/2*a;
        double y=(-b+d)/2*a;
        System.out.println("The roots of the eqution are"+x+"and"+y);
        }
    }
    
}