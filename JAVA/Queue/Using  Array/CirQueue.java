/*The Circular Queue using array*/
import java.util.Scanner;

public class CirQueue
{
	private static int max;
	private int a[]=new int[max];
	private int front=-1,rear=-1;
	public void insert(int item)
	{
		if(front==(rear+1)%max)
		{ 
			System.out.println("The Queue is full.So we can't add "+item);
		}
		else if(front==-1)
		{
			front=0;
			rear=0;
			a[rear]=item;
		}
		else
		{
			rear=(rear+1)%max;
			a[rear]=item;
		}
	}
	public void delete()
	{
		if(front==rear)
		{
			front=rear=-1;
			System.out.println("Queue is empty.");
		}
		else
		{
			System.out.println("The deleted Element is :"+a[front]);
			front=(front+1)%max;
			System.out.println("Element is deleted");
		}
	}
	public void display()
	{
		System.out.println("The Queue is:");
		if(front==-1)
			System.out.println("Queue is empty.");
		else
			for (int i=front; i<=rear; i=(i+1)%max) 
			{
				System.out.print(a[i]+"\t");
			}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of element in Queue?");
		max=sc.nextInt();
		CirQueue s=new CirQueue();
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