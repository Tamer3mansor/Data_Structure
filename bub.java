package com.company;

public class bub {
    private int [] arr;
    private int n;
    public bub(int m)
    {
        arr=new int[m];
        n=0;
    }
    public void insert(int v)
    {
        arr[n]=v;
        n++;
    }
    public void print()
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print("\n");
    }
    public void sort()
    { int out,in;
            for( out=n-1;out>=1;out--)
        { for( in=0;in<out;in++)
        if(arr[in]>arr[in+1])
            swap(in,in+1);
        }
    }
    private void swap(int n1,int n2)
    { int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }

}
