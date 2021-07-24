package selectionconcept;
import java.util.Scanner;

public class IfelseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(args[0]);
        if(N%2==0)
        {
        	if(N>=2 && N<=5)
        		System.out.println("Not Weird");
        	else if(N>=6 && N<=20)
        		System.out.println("Weird");
        	else
        		System.out.println("Not Weird");
        		
        }
        else
        	System.out.println("Weird");

        sc.close();
	}

}
