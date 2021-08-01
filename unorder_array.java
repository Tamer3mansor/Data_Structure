//Tamer Medhat
//Sec 1
package com.company;
import java.lang.String;
public class unorder_array
{
    private int []data;
    private int nelement=0;
    unorder_array(int cap)

    {
        data =new int[cap];
    }
    public void insert(int n)
    { data[nelement++]=n; }
    public int delet(int n)
    {int i=0;
        for(;i<nelement;i++)
        {
            if(data[i]==n) break; if (i==nelement-1){System.out.println("Notfound"); i=-1; break;}}
        if(i!=-1)
        {

            for(int j=i;j<nelement-1;j++)
            { data[j]=data[j+1];
            }
            nelement--;
        }
        return i;
    }

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
    public String search(int n)
    {  int i=0;
        for(;i<nelement;i++)
        {
            if(data[i]==n) break;
            else if (i==nelement-1){ i=-1;break; }
        }
        if(i!=-1)
            return "found";
        else
        {return "notfound";}
    }
    }


/*
test
10
12
15
16
 */
