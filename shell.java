//Tamer Medhat
//Sec 1
package com.company;

public class shell
{
    public void sort(int arr[],int n)
    {   int gap=0;
        for(gap=n/2;gap>0;gap=gap/2)
        {
            for(int i=gap;i<n;i++)
            {
                int temp=arr[i],j;
                for( j=i;j>=gap&&arr[j-gap]>temp;j-=gap)
                    arr[j]=arr[j-gap];
                arr[j]=temp;
            }
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
