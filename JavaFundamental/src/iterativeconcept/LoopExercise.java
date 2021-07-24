package iterativeconcept;

public class LoopExercise {

	public static void main(String[] args) {
		
		System.out.println("Execute method testPyramid :");
		testPyramid();
		System.out.println("Execute method reversePyramid :");
		reversePyramid();
		System.out.println("Execute method incrementNum :");
		incrementNum();
		System.out.println("Execute method incrementByThree :");
		incrementByThree();

	}
	public static void incrementByThree()
	{
		int k=1;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
		}
	}
	public static void incrementNum()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}
	public static void testPyramid()
	{
		int temp=0;
		int size=5;
	
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-i;j++)
		{
			temp++;
			System.out.print(temp);
			System.out.print("\t");
			
		}
		System.out.println(" ");
		
		
	}
	}
	public static void reversePyramid()
	{
		int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
		}
	}

}


