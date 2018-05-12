import java.util.Scanner;

public class InsertionSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[4];
		int cout=0;
		System.out.println("Enter 4 elements :");
		for (int i=0; i<array.length; i++) 
		{
			array[i]=sc.nextInt();
		}
		for (int i=1;i<array.length ; i++) 
		{
			int newElement=array[i];
			int j;
			for (j=i; j>0 && array[j-1]>newElement; j--) 
			{
				array[j]=array[j-1];
				cout++;
			}
			array[j]=newElement;
		}
		System.out.println("The array after Insertion Sorting become :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("The no of shiftings are :"+cout);
	}
}