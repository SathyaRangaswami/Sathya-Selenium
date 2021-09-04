package week1.day1.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum;
		for (int i = 0; i<=8; i++) {
			
			sum=firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
			       
			System.out.println("Fibonacci series"+sum);
		}
	}
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

			// Print first number
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum

}
