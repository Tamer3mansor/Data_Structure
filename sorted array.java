package com.company;

public class array {
    private int []data;
    private int nelement=0;
array(int cap)
{
    data =new int[cap];
}
    public void insert(int n)
    {int i=0;
        for(;i<nelement;i++)
        {
            if(data[i]>n)
            {
                break;
            }
        }
        for(int j=nelement;j>i;j--)
        {
            data[j]=data[j-1];
        }
        data[i]=n;
        nelement++;
    }
      public void delet(int n)
      { int i=0; int k=0;
       for(;i<nelement;i++)
       {
           if(data[i]==n)
           {
               k=1;
               break;
           }
       }

          for(int j=i;j<nelement-1;j++)
          {
              data[j]=data[j+1];
          }
       if(k==1)nelement--;
      }
         //   search()
    public boolean isempty()
    {
        return data.length!=nelement;
    }
    public void print()
    {
        for(int i=0;i<nelement;i++)
            System.out.print(data[i]+"    ");
        System.out.println(" ");
    }
    public boolean search(int n)
    { int min=0,max=nelement-1;
        while(true)
        {
            int mid=(min+max)/2;
            if(data[mid]==n)
            {
                return true;
            }
            else if(n>mid)
            {
                min=mid+1;
            }
            else
            {
                max=mid-1;
            }
            if(min>max)
            {
                return false;
            }
        }
    }

}
/*
10
12
15
16
 */
