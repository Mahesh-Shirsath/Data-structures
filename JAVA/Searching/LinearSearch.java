import java.util.Scanner;
import java.util.Random;
public class LinearSearch
{
	public static int n;
	public static int array[]=new int[10];
	public int search(int item)
	{
		for(int i=0;i<n;i++)
		{
			if(array[i]==item){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		LinearSearch l=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want in array :");
		n=sc.nextInt();
		Random randomGenerator = new Random();
		for (int i=0;i<n+1 ;i++ ) 
		{
			double randomDouble = Math.random();
			randomDouble = randomDouble * 50 + 1;
			int randomInt = (int) randomDouble;
			array[i] =randomInt ;
		}
		String n1="true";
		while(n1=="true")
		{
			System.out.println("Enter the you want to search :");
			int item=sc.nextInt();
			System.out.println("The possition is :"+l.search(item));
			System.out.println("If want to again search say Yes :");
			String q=sc.next();
			if(q.equals("Yes") || q.equals("yes") || q.equals("y")){
				n1="true";
			}
			else {
				System.out.println("The elements are :");
				for (int i=0;i<n+1 ;i++ ) 
				{
					System.out.println(array[i]);
				}
				n1="false";
			}
		}
	}
}