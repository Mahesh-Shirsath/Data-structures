import java.util.Scanner;

public class MergeSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input[]=new int[4];
		System.out.println("Enter 4 elements :");
		for (int i=0; i<input.length; i++) 
		{
			input[i]=sc.nextInt();
		}
		mergeSort(input, 0, input.length);
		System.out.println("The input after Merge Sorting become :");
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]);
		}
	}
	public static void mergeSort(int[] input,int start,int end)
	{
		if(end - start<2)
			return ;
		int mid =(start + end) /2;
		mergeSort(input,start,mid);
		mergeSort(input,mid,end);
		merge(input,start,mid,end);
	}
	public static void merge(int[] input,int start,int mid,int end)
	{
		if(input[mid-1]<=input[mid])
		{
			return ;
		}
		int i=start;
		int j=mid;
		int tempIndex=0;
		int[] temp=new int[end-start];
		while(i<mid && j<end){
			temp[tempIndex++]=input[i]<=input[j] ? input[i++] : input[j++];	
		}
		System.arraycopy(input,i,input,start + tempIndex,mid - i);
		System.arraycopy(temp ,0,input, start, tempIndex);
	} 
}