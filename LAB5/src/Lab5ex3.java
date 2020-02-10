import java.util.Scanner;

public class Lab5ex3 {

	boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
			if((n%i)==0)
				return false;
		return true;
	}
	
	
	void allPrimeNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		sc.close();
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i)==true)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab5ex3 obj= new Lab5ex3();
		obj.allPrimeNum();
	}

}
