//Tamer Medhat
//Sec 1
package com.company;

public class linked_list {
    private link first;
    public  linked_list()  { first=null; }
 public void insert_first(int d)
    {
        if(first==null)
        {
            link x=new link(d);
        x.next=first;
        first=x;
        }
        else
        {
            link y=new link(d);
            y.next=first;
            first=y;
        }

    }
    public void insert_last(int d)
    {
        link t=new link(d);
        link current=first;
        if(first==null) {
            link x = new link(d);
            x.next = first;
            first = x;
        }
        else{
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=t;
        t.next=null;
    }
    }
    public int delet_first()
    {
        if(first==null)
        {   return 0; }
        else{
        link temp=first;
        first=first.next;
        return temp.data;
    }
    }
    public int delet_last()
    {
        link parent=first;
        link current=first;
        link temp=null;
        if(first==null)
        {   return 0; }
else{
        while(current.next!=null)
        {
            parent=current;
            current=current.next;
        }
        temp=current;
        parent.next=null;
        return temp.data;

    }
    }
    public void disply()
    {
        link current=first;
        if(first==null) System.out.print("Empty");
       else
           while(current!=null)
        {
            System.out.print(current.data);
            current=current.next;
        }
        System.out.println(" ");
    }

}
