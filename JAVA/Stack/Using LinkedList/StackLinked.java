/*The Stack using Limked list*/

import java.util.Scanner;

class Node
{
	public int info;
	public Node next;
	Node()
	{
		info=0;
		next=null;
	}
	public Node head=null;
	public void push(int item)
	{
		Node temp=new Node();
		temp.info=item;
		temp.next=head;
		head=temp;
	}
	public void pop()
	{
		System.out.println("The deleted elment is:"+head.info); 
		head=head.next;
	}
	public void display()
	{
		Node ptr=head;
		System.out.println("The Stack is :");
		while(ptr!=null)
		{
			System.out.println(ptr.info);
			ptr=ptr.next;
		}
	}
}
public class StackLinked
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		Node s=new Node();
		System.out.println("1.Push");
		System.out.println("2.Pop");
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
						s.push(item);
						break;
				case 2:
						s.pop();
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