package iterativeconcept;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//check given number is a prime or not using a method.
				
		chkPrimeNumber();
	}
	private static void chkPrimeNumber()
	{
		int num;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a Number ");
		num=in.nextInt();
		 int m=0,flag=0;      
		  //num=3;//it is the number to be checked    
		  m=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
			   	for(int i=2;i<=m;i++){      
				   
				    if(num%i==0){      
				     System.out.println(num+" is not prime number");      
				     flag=1;      
				     break;      
				    }      
				   }      
				   if(flag==0)  { System.out.println(num+" is prime number"); }  
				  }//end of else  
	}    
	

}
