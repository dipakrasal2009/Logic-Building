import java.util.*;

class Program467
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sobj.nextLine();

        char Arr[]= str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);

        int Count = 0;

        for(char Ch : Arr)
        {
            if((Ch >= 'a')&&(Ch <= 'z'))
            {
                Count++;
            }
        }
        System.out.println("small character are : "+Count);
    }
}//using for each loop