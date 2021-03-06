/*The Ordinary Queue using Linked list*/

import java.util.Scanner;
class Node1
{
	public int info;
	public Node1 next;
	public Node1()
	{
		info=0;
		next=null;
	}
	public Node1 head=null;
	public void insert(int item)
	{
		Node1 temp=new Node1();
		Node1 ptr=head;
		temp.info=item;
		if(ptr==null)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
			while (ptr.next!=null) 
				ptr=ptr.next;
			ptr.next=temp;
			temp.next=null;
		}
	}
	public void delete()
	{
		if(head==null)
			System.out.println("Queue is empty.");
		else
		{
			System.out.println("The deleted element is :"+head.info);
			head=head.next;
		}
	}
	public void display()
	{
		Node1 ptr=head;
		System.out.println("The Queue is :");
		while (ptr!=null) 
		{
			System.out.print(ptr.info+"\t");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
public class QueueLinked
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		Node1 s=new Node1();
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		while(true)
		{
			System.out.print("Enter your choice :");
			choice=sc.nextInt();
			switch (choice) 
			{
				case 1:
						System.out.print("Enter no :");
						int item=sc.nextInt();
						s.insert(item);
						break;
				case 2:
						s.delete();
						break;
				case 3:
						s.display();
						break;
				case 4:
						return ;
				default:
					System.out.println("Enter another choice.");
			}
		}
	}
}