import java.util.Scanner;

public class Lab5ex2 {

	int fibonacciRecursive(int n)
	{
		int first =1,second=1;
		if(n==1)
			return first;
		else if(n==2)
			return second;
		else
		{
			return fibonacciRecursive(n-1) +fibonacciRecursive(n-2);
		}
	}

	int fibonacciWithoutRecursion(int n)
	{
		int first=1;
		int second=1;
		if(n==1)
			return first;
		else if(n==2)
			return second;
		else
		{
			int term=0;
			for(int i=3;i<=n;i++)
			{
				term= first + second;
				first=second;
				second=term;
			}
			return term;
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term you want of the fibonacci series");
		int n=sc.nextInt();
		Lab5ex2 obj=new Lab5ex2();
		System.out.println("With recursion" +obj.fibonacciRecursive(n));
		System.out.println("Without recursion" +obj.fibonacciWithoutRecursion(n));
		sc.close();

	}

}
