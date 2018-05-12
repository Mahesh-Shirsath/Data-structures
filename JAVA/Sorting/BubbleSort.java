import java.util.Scanner;

public class BubbleSort
{
	public static int a[]=new int[5];
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers :");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int unsortedIndex =a.length - 1;unsortedIndex>0;unsortedIndex--)
		{
			for(int i=0;i<unsortedIndex;i++)
			{
				if(a[i]>a[i+1])
				{
					swap(a,i,i+1);
				}
			}
		}
		System.out.println("The BubbleSorted array is :");
		for (int i=0 ;i<a.length ; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public static void swap(int[] a,int i,int j)
	{
		if(i==j)
			return ;
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}