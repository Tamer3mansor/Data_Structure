#include <iostream>
#include<vector>
using namespace std;
class arraybub{
	vector<double>v;
	int n;
	void swap(int n,int n1)
	{
		
		double temp=v[n];
	        v[n]=v[n1];
	        v[n1]=temp;
		
	}
	public:
		arraybub(int max)
		{
			v.resize(max);
		}
void sort()
{
	int out,in;
	for( out=n-1;out>1;out--)
	{
		for( in=0;in<out;in++)
		{
			if(v[in]>v[n+1])
			swap(in,in+1);
			
		}
	}
}
void display()
{
	for(int j=0;j<n;j++)
	{
		cout<<v[j]<<" ";
	}
}
void insert(double value)
{
	v[n]=value;
	n++;
}
void siz()
{
	cout<<v.size();
}

};
int main()
{
	int m=500;
 arraybub d(m);
 d.insert(5);
 d.insert(2);
 d.insert(9);
 d.siz();
 d.display();
 d.sort();
 d.display(); 	
}
