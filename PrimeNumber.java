package week1.day1.assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		int pNum=13;
	boolean flag= false;

		for (int i = 2; i<pNum; i++) {
			if(pNum%i==0)
			{ 
				flag=true;
			}
		
		}
		if(flag==true)
		{
			System.out.println(pNum+" is not prime");
		}
	else
		{
			System.out.println(pNum+ " is prime");
		}
		// Iterate from 2 to half of the input	

			// Divide the input with each for loop variable and check the remainder		
			// Set the flag as true when there is no remainder				
			// break the iterator
		
	}

}
