import java.util.Scanner;

public class QuickSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 elements :");
		int array[]=new int[4];
		for(int i =0; i<array.length; i++)
		{
			array[i]=sc.nextInt();
		}
		quickSort(array, 0, 4);
		System.out.println("The input after Quick Sorting become :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void quickSort(int[] input, int start, int end)
	{
		if(start - end < 2)
		{
			return ;
		}
		int pivotIndex = position(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}
	public static int position(int[] input, int start, int end)
	{
		int pivot = input[start];
		int i=start;
		int j=end;
		while(i<j)
		{
			while(i<j && input[--j] >= pivot);
			if (i<j) { 
				input[i] = input[j];
			}
			while(i<j && input[++i] <= pivot);
			if(i<j)
			{
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}
}