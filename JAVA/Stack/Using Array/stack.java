/*The Stack using array*/

import java.util.Scanner;
public class stack
{
	private int a[]=new int[10];
	private int top=-1;
	public void push(int item)
	{
		if(top==9)
			System.out.println("Stack is overflow.");
		else
			a[++top]=item;
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack is underflow.");
		else
			System.out.println("The deleted element is :"+a[top--]);
	}
	public void display()
	{
		System.out.print("The element in Stack are :");
		for(int i=0;i<=top;i++)
			System.out.print("|\t"+a[i]);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
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