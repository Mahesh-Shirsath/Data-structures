/*The program to form Queue using two Stacks*/

import java.util.Scanner;
import java.util.Stack;

public class Queue1
{
	public static void main(String[] args) 
	{
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		while(true)
		{
			System.out.print("Enter your choice :");
			int choice=sc.nextInt();
			switch (choice) 
			{
				case 1:
						System.out.print("Enter no :");
						int item=sc.nextInt();
						s1.push(item);
						break;
				case 2:
						while(!s1.empty())
							s2.push(s1.pop());
						System.out.println(s2.pop());
						while(!s2.empty())
							s1.push(s2.pop());
						break;
				case 3:
						for(int i=s1.size()-1; i>=0;i--)  
							System.out.println(s1.get(i));
				        break;
				case 4:
						return ;
				default:
					System.out.println("Enter another choice.");
			}
		} 
	}
}
