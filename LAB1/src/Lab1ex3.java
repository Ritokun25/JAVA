import java.util.*;
public class Lab1ex3 {
Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Lab1ex3 obj = new Lab1ex3();
System.out.println("The Difference is  " + obj.calculateDifference());
	}
	
	int calculateDifference()
	{
		System.out.println("Enter a natural number :  ");
		 int n =sc.nextInt();
		int i, sumSquare = 0 , squareSum = 0,difference;
		for(i=1 ; i<=n ; i++)
		{
			sumSquare = sumSquare + (i*i);
			squareSum = squareSum + i ;
		}
		
		difference = sumSquare - (squareSum * squareSum);
		return difference;
	}

}
