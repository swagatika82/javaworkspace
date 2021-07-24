package arrayconcept;
import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find the minimum and maximum element in an array
		
		int[] arr=new int[] {9,15,11,3,17,5};
		
		findMinValue(arr);
		findMaxValue(arr);
		findReverseArray(arr);
	}
	
	public static void findMinValue(int[] arr)
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("Minimum value is : " + temp);
	}

	public static void findMaxValue(int[] arr)
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("Maximum value is : " + temp);
	}
	public static void findReverseArray(int[] arr)
	{
		int temp=arr[0];
		//int[] temp=new int[arr.length];
		System.out.println("Array in reverse order: ");  
		for(int i=arr.length-1;i>=0;i--)
		{
			 System.out.print(arr[i] + " ");  
		}
		
	}
	
}
