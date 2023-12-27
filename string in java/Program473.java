import java.util.*;

class Program473
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");
        
        System.out.println("Number of wordes are : "+Arr.length);

    }
}