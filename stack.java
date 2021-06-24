package com.company;
import java.util.EmptyStackException;
public class stack
{
public class node
{
    public int item;
    public node next;
    node()
    {
        next=null;
    }
}
node top=null;
public void push(int it)
{
   node temp=new node();
 temp.item=it;
 temp.next=top;
 top=temp;
}
public boolean empty()
{
    if(top==null)
        return true;
    else
        return false;
}
public  void pop()
{
    node templ=new node();
    templ=top;
     top=top.next;
     templ.next=null;


}
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");

        }
        else {
            node temp = top;
            while (temp != null)
            {
                System.out.printf("%d->", temp.item);
                temp = temp.next;
            }
        }
    }

}