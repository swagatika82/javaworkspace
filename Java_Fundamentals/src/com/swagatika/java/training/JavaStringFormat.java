package com.swagatika.java.training;

public class JavaStringFormat {

	public static void main(String[] args) {
		convertCharArrayToString();
		findFactorialusingForLoop();
				
				stringBubbleSort();

	}
	//How to convert a char array to a string in Java?
		public static void convertCharArrayToString()
		{
			char[] arr= {'h','e','l','l','o'};
			String str=new String(arr);
			System.out.println(str);
			
			String str1= String.valueOf(arr);
			System.out.println(str1);
		}
		//Finding factorial using for loop
		public static void findFactorialusingForLoop()
		{
			//5! = 4 × 3 × 2 × 1 = 120
			int num=5;
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact * i;
			}
			System.out.println(fact);
		}
		//Finding Factorial using while loop
		public static void findFactorialusingWhileLoop()
		{
			//5! = 4 × 3 × 2 × 1 = 120
			int number = 5;
	        long fact = 1;
			int i = 1;
	        while(i<=number)
	        {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Factorial of "+number+" is: "+fact);
		}
		//Java program to perform Bubble Sort on Strings
		public static void stringBubbleSort()
		{
			String str[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan"};
			String temp;
			System.out.println("Strings in sorted order:");
			for (int j = 0; j < str.length; j++) {
		   	   for (int i = j + 1; i < str.length; i++) {
		   		   int num=str[i].compareTo(str[j]);
				// comparing adjacent strings
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			   }
			   System.out.println(str[j]);
			}
		}

}
