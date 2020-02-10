import java.util.*;
public class Lab6ex1 {

	void getIntegerLine()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a line of integers");
		String line =sc.nextLine();
		sc.close();
		int sum=0;
		StringTokenizer st1=new StringTokenizer(line);
		while(st1.hasMoreTokens())
		{
			String tok =st1.nextToken();
			System.out.print(tok + "   ");
			sum=sum + Integer.parseInt(tok);
		}
		System.out.println("\n");
		System.out.println("The sum is " + sum );

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6ex1 obj =new Lab6ex1();
		obj.getIntegerLine();
	}

}
