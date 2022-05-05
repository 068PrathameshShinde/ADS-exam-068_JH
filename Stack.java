// Q 3)


class Stack
{
	int arr[];
	int n;
	int top1;
	int top2;
	
	Stack(int x)
	{
		n=x;
		arr=new int[x];
		top1=x/2 +1;
		top2=x/2;
	}
	
	void push1(int y)
	{
		if(top1>0)
		{
			top1--;
			arr[top1]=y;
		}
		else
		{
			System.out.println("stack overflow");
			return;
		}
	
	}
	
	void push2(int z)
	{
		if(top2< n-1)
		{
			top2++;
			arr[top2]=z;	
		}
		else
		{
			System.out.println("stack overflow");
			return;
		}
	
	}
	int pop1()
	{
		if(top1<=n/2)
		{
			int x=arr[top1];
			top1++;
			return x;
		}
		else
		{
		System.out.println("stack underflow");
		return 0;
		}
	
	}
	
	int pop2()
	{
		if(top2>=n/2 +1)
		{
			int x=arr[top2];
			top2--;
			return x;
		}
		else
		{
		System.out.println("stack underflow");
		return 0;
		}
	
	}
	
	public static void main(String args[])
	{
		Stack s=new Stack(15);
		
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("poped element from stack1 :"+s.pop1());
		System.out.println("poped element from stack2 :"+s.pop2());
	}


}