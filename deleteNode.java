[5:57 PM, 10/13/2020] Deepali: package st;
import java.util.*;
public class circularLinkedList
{
	static class Node
	{
		Node next;
		int data;
		Node (int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
	}
	public boolean checkCircular()
	{
		if(head==null)
			return true;
		Node tem=head.next;
		while(tem!=null&&tem!=head)
		{
			tem=tem.next;
		}
		return (tem==head);
	}
	void print()
	{
		System.out.print(head.data+" ");
		Node cur=head.next;
		while(cur!=null&&cur!=head)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	void madeCircular()
	{
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=head;
	}
	public static void main(String args[])
	{
		circularLinkedList l=new circularLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		System.out.println(l.checkCircular());
		l.print();
		System.out.println();
		l.madeCircular();
		System.out.println(l.checkCircular());
	}
}
[6:00 PM, 10/13/2020] Deepali: import java.util.*;
public class deleteNode
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
	}
	void print(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	void delete(Node head,int data)
	{
		boolean t=false;
		Node cur=head;
		if(cur.data==data)
		{
			head=head.next;
			return;
		}
		while(cur.next!=null)
		{
			if(cur.next.data==data)
			{
				cur.next=cur.next.next;
				t=true;
				return;
			}
			else
			{
				cur=cur.next;
			}
		}
		if(t==false)
		{
			System.out.println("Not Found");
		}
	}
	public static void main(String args[])
	{
		deleteNode d=new deleteNode();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			d.insert(sc.nextInt());
		}
		d.delete(d.head,20);
		d.print(d.head);
	}
}
