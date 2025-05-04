public class Week3a 
{
    void add(int a,int b)
    {
    System.out.println(a+"+"+b+"="+(a+b));
    }
    void add(int a,int b,int c)
    {
    System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
    }
     void add(String a,String b)
    {
    System.out.println(a+"+"+b+"="+(a+b));
    }
     public static void main(String []args)
    {
    Week3a ob= new Week3a();
    ob.add(1,2);
    ob.add(1,2,3);
    ob.add("Hello ","World");
    }
}
