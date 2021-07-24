package iterativeconcept;

public class FibanocciSeries {

	public static void main(String[] args) {
		// print Fibanocci Series by swapping variables
		
				//0 1 1 2 3 5 8 13
				
				int a=0;
				int b=1;
				int result=0;
				int i=1;
				while(i<9)
				{
					result=a+b;
					System.out.print(result +  "\t");
					a=b;
					b=result;
					i++;
				}

	}

}
