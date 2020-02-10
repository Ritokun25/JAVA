import java.util.Scanner;

public class Lab4 {

void sumCube()
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	sc.close();
	int sum =0 ;
	while(num>0)
	{
		sum = (int) (sum + Math.pow((num%10),3));
		num/=10;
		
	}
	System.out.println("The result is "+ sum);
}

public static void main(String args[])
{
	Lab4 obj =new Lab4();
	obj.sumCube();
	
}
	
}
