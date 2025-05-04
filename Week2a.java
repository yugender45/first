import java.util.*;
public class Week2a {
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    int left=0;
    int right=str.length()-1;
    boolean ispal=false;
    while(left<right)
    {
    if(str.charAt(left)==str.charAt(right))
        ispal=true;
    left++;
    right--;
    }
    if(ispal)
        System.out.println("The given string "+str+" is a palindrom");
    else
        System.out.println("The given string "+str+" is not a palindrom");
    }
}
