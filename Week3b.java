class human
{
void eat()
    {
    System.out.println("Human is eating");
    }
}
public class Week3b extends human{
    void eat()
    {
    System.out.println("boy is eating");
    }
public static void main(String [] args)
    {   
    Week3b ob=new Week3b();
    ob.eat();
    }
}
