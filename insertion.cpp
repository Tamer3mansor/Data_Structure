#include<bits/stdc++.h>
using namespace std;
sort(int arr[],int n)
{
	int size=sizeof(arr)/sizeof(arr[0]);
	for(int out=1;out<n;out++)
	{//15 10  22 20 5
	/*
	   10 15  22 20 5
	
	   10 15  20 22 5
	   
	   10 15  20 22 |5<<(in&out&temp)//in=4&3
	   10 15  20 22 22//in 3&2
	   10 15  20 20 22//in 2&1
	   10 15  15 20 22//in 1&0
	   10 10  15 20 22//in 0 end;
	  
	   5  10  15 20 22
	   
	
	*/
		int temp=arr[out];
		int in=out;
		while(in>0&&arr[in-1]>temp)
		{
			arr[in]=arr[in-1];
			--in;
		}
		arr[in]=temp;
	}
}
print(int arr[],int n)
{
	int s=sizeof(arr)/sizeof(arr[0]);
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" "<<endl;
	}
}
int main()
{
	int arr[20]={20,19,15,8,7,6,4,2,3,1,9,1,1,14,16,17,0,7,9,21};
	sort(arr,20);
	print(arr,20);
}
