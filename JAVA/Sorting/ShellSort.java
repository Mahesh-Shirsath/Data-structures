import java.util.Scanner;

public class ShellSort
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
		for(int gap=array.length/2;gap>0;gap/=2)
		{
			for (int i =gap; i<array.length; i++) 
			{
				int newElement =array[i];
				int j=i;
				while(j>=gap&& array[j-gap]>newElement)
				{
					array[j]=array[j-gap];
					j-=gap;
					cout++;
				}
				array[j]=newElement;
			}
		}
		System.out.println("The array after Shell Sorting become :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("The no of shiftings are :"+cout);
	}
}