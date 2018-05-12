import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[]{24,56,8,79,56,12};
		while(true)
		{
			System.out.println("Which element you want to search :");
			int x=sc.nextInt();
			System.out.println("The position is :"+binarySearch(array, 0, array.length, x));
		}
	}
	public static int binarySearch(int[] array, int start ,int end, int value)
	{
		if(start>=end){
			return -1;
		}
		int midPoint = (start + end)/2;
		if(array[midPoint] == value){
			return midPoint;
		}
		else if(array[midPoint] >= value){
			return binarySearch(array, 0, midPoint, value);
		}
		else{
			return binarySearch(array, midPoint + 1, end, value);
		}
	}
}