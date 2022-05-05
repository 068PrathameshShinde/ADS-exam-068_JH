//Q 2) reverse the linkedlist


class LinkedList
{
	static int count=0;
	static Node head;
	static class Node
	{
		int data;
		Node next;
	
		Node(int n)
		{
			data=n;
			next=null;
		}
	}
	void push(int x)
	{
		Node n=head;
		count++;
		Node new_node=new Node(x);
		
		if(head==null)
		{
			head=new_node;
			return;
		}
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		
	}
	 Node reverse(Node head)
	{
		Node next=null;
		Node n=head;
		Node prev=null;
		
		while(n!=null)
		{
			next=n.next;
			n.next=prev;
			prev=n;
			n=next;
		}
		Node node=prev;
		
		return node;
	}
	void display(Node n)
	{
		
		System.out.println(count);
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	
	
	}

	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		
		l.push(1);
		l.push(2);
		l.push(3);

		System.out.println("before reverse");
		l.display(head);
		
		Node n=l.reverse(head);
		System.out.println("after reverse");
		l.display(n);
	
	}


}