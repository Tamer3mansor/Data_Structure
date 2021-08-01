//Tamer Medhat
//Sec 1
package com.company;
//Insert, search, prorder, postorder, inorder, maximum, minimum)
public class tree
{
    private node root;
    public void insert(int d)
    {
        node x=new node(d);
        node current=root;
        node parent=root;
        if(current==null)//Tree is empty
        {
            root=x;
        }
        else
        {
            while(true)
            {
                parent=current;
            if(current.data<d)
            {current=current.right_child;
            if(current==null){parent.right_child=x; return;}
            }
            else {current=current.left_child;
                if(current==null){parent.left_child=x; return;}

            }
            }
        }

    }
    public node search(int d)
    {node current = root;
        if(root==null) {System.out.println("NotFound!Empty Tree");}
        else {
            while (current.data != d) {
                if (current.data > d) {
                    current = current.right_child;
                } else current = current.left_child;

                if (current == null) {
                    return null;
                }

            }
        }
        return current;

    }
    public void preorder(node localroot)
    {
        if(localroot!=null)
        {
            System.out.println(localroot.data);
            inorder(localroot.left_child);
            inorder(localroot.right_child);
        }
    }
    public void inorder(node localroot)
    {
        if(localroot!=null)
        {
            inorder(localroot.left_child);
            System.out.println(localroot.data);
            inorder(localroot.right_child);
        }
    }
    public void postorder(node localroot)
    {
        if(localroot!=null)
        {

            inorder(localroot.left_child);
            inorder(localroot.right_child);
            System.out.println(localroot.data);
        }
    }
    public node mine()
    {node current ;node last=null;
        current=root;
        while(current!=null)
        {
            last=current;
            current=current.left_child;
        }
        return last;

    }
    public node maxe()
    {node current ;node last=null;
        current=root;
        while(current!=null)
        {
            last=current;
            current=current.right_child;
        }
        return last;

    }
        }

