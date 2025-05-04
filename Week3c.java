interface Printable
{
    void print();
}
interface Showable
{
    void show();
}
public class Week3c implements Printable,Showable
{
     @Override
    public void print() {
    System.out.println("Hello");
    }
    @Override
    public void show() {
        System.out.println("World");
    }
    public static void main(String[] args)
    {
     Week3c ob =new Week3c();
     ob.print();
     ob.show();
    }

}
