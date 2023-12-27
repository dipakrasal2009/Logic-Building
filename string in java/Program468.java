import java.util.*;

class Program468
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
        int i = 0;
        while(i<Arr.length)
        {
            if((Arr[i] >= 'a')&&(Arr[i] <= 'z'))
            {
                Count++;
            }
            i++;
        }
        System.out.println("small character are : "+Count);
    }
}//using for each loop