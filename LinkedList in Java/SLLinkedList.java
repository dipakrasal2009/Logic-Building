import java.util.*;

class Node 
{
    public int Data;
    public Node Next;

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    private int count;

    public SinglyLL()
    {
        Head = null;
        count = 0;
    }

    protected void finalize()
    {
        //memory free
    }

    public  void InsertFirst(int No)
    {
        System.out.println("InsertFirst Function :");
        Node newn = new Node(No);
        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.count++;
    }

    public void Display()
    {
        System.out.println("element from te linked list are : ");
        Node temp = this.Head;

        while(temp != null)
        {
            System.out.print("|"+temp.Data+"|->");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public void InsertLast(int No)
    {
        System.out.println("InsertLast Function :");

        Node newn = new Node(No);
        if(this.Head == null)
        {
            this.Head = newn;
            this.count++;
        }
        else
        {
            Node temp = this.Head;
            while(temp.Next != null )
            {
                temp = temp.Next;
            }
            temp.Next = newn;
            newn.Next = null;

            this.count++;
        }
    }

    public void InsertAtPos(int No,int iPos)
    {
        System.out.println("Insert At position Function :");

        if((iPos < 0) || (iPos > count+1))
        {
            System.out.println("invalid position");
            return;
        }
        else if(iPos == 1)
        {
            InsertFirst(No);
        }
        else if(iPos == count+1)
        {
            InsertLast(No);
        }
        else
        {
            Node newn = new Node(No);
            Node temp = this.Head;

            for(int i = 0;i < iPos-1;i++)
            {
                temp= temp.Next;
            }
            newn.Next = temp.Next;
            temp.Next = newn;
            count++;
        }

    }

    public void DeleteFirst()
    {
        System.out.println("DeleteFirst Function :");

        if(this.count == 0)
        {
            return;
        }
        else if(this.count == 1)
        {
            this.Head = null;
        }
        else
        {
            Head = Head.Next;
        }
        count--;
    }

    public void DeleteLast()
    {
        System.out.println("DeleteLast Function :");

        if(this.count == 0)
        {
            return;
        }
        else if(this.count == 1)
        {
            this.Head = null;
        }
        else
        {
            Node temp = this.Head;

            while(temp.Next.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        count--;
    }

    public void DeleteAtPos(int iPos)
    {
        System.out.println("Delete At Position Function :");

        if((iPos < 0)||(iPos > count+1))
        {
            System.out.println("invalid position");
            return;
        }
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == count+1)
        {
            DeleteLast();
        }
        else
        {
            Node temp = this.Head;

            for(int i = 0;i< iPos-1;i++)
            {
                temp = temp.Next;
            }
            temp.Next = temp.Next.Next;

        }
        count --;

    }
}

class SLLinkedList
{
    public static void main(String a[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();

        obj.InsertAtPos(71,3);

        obj.Display();

        obj.DeleteFirst();

        obj.Display();

        obj.DeleteLast();

        obj.Display();

        obj.DeleteAtPos(2);

        obj.Display();
    }
}