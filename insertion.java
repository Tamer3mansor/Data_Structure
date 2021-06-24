package com.company;

public class insertion {
   public  void sort(int arr[],int n)
   {
       for(int out=1;out<n;out++)
       {
           int in=out;
           int temp=arr[out];
           while(in>0&&arr[in-1]>temp)
           {
               arr[in]=arr[in-1];
               in--;
           }
           arr[in]=temp;
       }
   }
   public void print(int arr[],int n)
   {
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.print("  \n");
   }
}
