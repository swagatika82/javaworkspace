package iterativeconcept;

public class WithoutLoop {

	public static void main(String[] args) {
		// print 1 to 100 without using for loop

		printWithoutUsingLoop(1);
	}
	public static void printWithoutUsingLoop(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			printWithoutUsingLoop(num+1);
		}
	}

}
