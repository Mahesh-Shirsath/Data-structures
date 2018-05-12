/*The Doubly Linked List*/
import  java.util.Scanner;

class Node2
{
	public int info;
	public Node2 next;
	public Node2 prev;
	public Node2()
	{
		info=0;
		next=null;
		prev=null;
	}
	public Node2 head=null;
	public void insertatstart(int item)
	{
		Node2 temp=new Node2();
		temp.info=item;
		temp.next=head;
		temp.prev=null;
		head=temp;
	}
	public void insertatn(int item,int n)
	{
		Node2 temp=new Node2();
		Node2 ptr1=head,ptr2=null;
		temp.info=item;
		for(int i=1;i<n;i++)
			ptr1=ptr1.next;
		if(ptr1==null)
        {
           throw new NullPointerException("This position does not exist");
        }
        ptr2=ptr1.next;
		temp.next=ptr2;
		temp.prev=ptr1;
		if(ptr2==null)
        {
           throw new NullPointerException("This position does not exist");
        } 
		ptr2.prev=temp;
		ptr1.next=temp;
	}
	public void insertatend(int item)
	{
		Node2 temp=new Node2();
		Node2 ptr1=head;
		while (ptr1.next!=null) 
			ptr1=ptr1.next;
		ptr1.next=temp;
		temp.prev=ptr1;
		temp.info=item;
		temp.next=null;
	}
	public void deleteatstart()
	{
		System.out.println("The deleted element is:"+head.info);
		head=head.next;
		head.prev=null;
	}
	public void deleteatn(int n)
	{
		Node2 ptr1=head,ptr2=null,ptr3=null;
		for(int i=1;i<n-1;i++)
			ptr1=ptr1.next;
		ptr2=ptr1.next;
		System.out.println("The deleted element is:"+ptr2.info);
		ptr3=ptr2.next;
		ptr1.next=ptr3;
		ptr3.prev=ptr1;
	}
	public void deleteatend()
	{
		Node2 ptr=head;
		while (ptr.next!=null) 
		{
			ptr=ptr.next;
		}
		Node2 ptr2=ptr.prev;
		System.out.println("The deleted element is:"+ptr.info);
		ptr2.next=null;
	}	
	public void display()
	{
		Node2 ptr=head;
		System.out.print("The element in Linked list are :");
		while (ptr!=null) 
		{
			System.out.print(ptr.info);
			ptr=ptr.next;
		}
		System.out.println();
	}

}
public class Doubly
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		Node2 s=new Node2();
		System.out.println("1.Insert at start");
		System.out.println("2.Insert at n position");
		System.out.println("3.Insert at end");
		System.out.println("4.Delete at start");
		System.out.println("5.Delete at n position");
		System.out.println("6.Delete at end");
		System.out.println("7.Display");
		System.out.println("8.Exit");
		while(true)
		{
			System.out.print("Enter your choice :");
			choice=sc.nextInt();
			switch (choice) 
			{
				case 1:
						System.out.print("Enter no :");
						int item=sc.nextInt();
						s.insertatstart(item);
						break;
				case 2:
						System.out.print("Enter no :");
						item=sc.nextInt();
						System.out.println("Enter the position :");
						int n=sc.nextInt();
						s.insertatn(item,n);
						break;
				case 3:
						System.out.print("Enter no :");
						item=sc.nextInt();
						s.insertatend(item);
						break;	
				case 4:
						s.deleteatstart();
						break;
				case 5:
						System.out.print("Enter the position :");
						n=sc.nextInt();
						s.deleteatn(n);
						break;
				case 6:
						s.deleteatend();
						break;
				case 7:
						s.display();
						break;
				case 8:
						return ;
				default:
					System.out.println("Enter another choice.");
			}
		}
	}
}