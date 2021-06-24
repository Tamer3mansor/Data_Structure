#include<iostream>
using namespace std;
template <class t> 
class stack{
	int top;
	t item[100000];
public:
	stack()
	{
		top=0;
	}
	void push(t x)
	{
		if(top>=100000)
		cout<<"No Place ";
		else
		{
		item[top]=x;
		top++;
		}
	}
	void pop()
	{
		if(top==0)
		{
			cout<<"No Element";
		}
		else 
		top--;
	}
	int get_top()
	{
		return item[top-1];
	}
	void print ()
	{
		int te=top;
		for(int i=te-1;i>=0;i--)
		{
			cout<<item[i]<<" ";
		}
		cout<<endl;
	}
		
};
int main()
{
	stack <int>s;
	s.push(10);s.push(15);s.push(20);
	s.print();
	cout<<s.get_top()<<"  ";
}
