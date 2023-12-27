import java.util.*;

class Program465
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sobj.nextLine();

        char Arr[]= str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);
    }
}