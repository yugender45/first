public class Week5a 
{
    public static void main(String[]args)
    {
        int arr[]=new int [5];
     try
     {
      arr[5]=3;
     }
     catch(ArithmeticException e)
     {
     System.out.println("number cant be divided by 0");
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println("The nubmber cant be divided by o");
     }
     
     
    }
    }
