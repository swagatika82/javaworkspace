import java.util.Scanner;

public class DatatypeConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean b=true; //valid
		//boolean b=0;		//invalid
		//boolean b=True;	//invalid
		//boolean b="True";	//invalid
		//System.out.println(b);
		
		//int x=0;
		/*
		 * if(x) System.out.println("true"); else System.out.println("false");
		 */
		//input in console
		/* 5
		-150
		150000
		1500000000
		213333333333333333333333333333333333
		-100000000000000 */
		 
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                else if(x>=-32768 && x<=32767){
                	System.out.println("* short");
                	System.out.println("* int");
                	System.out.println("* long");
                }
                else if(x>=-2e31 && x<=2e31-1){
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-2e63 && x<=2e63-1)System.out.println("* long");
               
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
		
	}

}
