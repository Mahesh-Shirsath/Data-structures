/* Program of reversing a string using stack */
import java.util.Scanner;
import java.util.Stack;
public class Reverse
{
	public static void main(String[] args) 
	{
		char a[]=new char[10];
		Stack<Character> s=new Stack<Character>();
		System.out.println("Enter the string which you want to Reverse :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.print(s.pop());
		}
		System.out.println();
	}
}

/*OUTPUT IS :
Enter the string which you want to Reverse :
mahesh
hseham
*/