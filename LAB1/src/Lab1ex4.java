import java.util.*;
public class Lab1ex4 {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab1ex4 obj=new Lab1ex4();
		System.out.println("The sum is : " +obj.calculateSum());

	}
	//to calculate sum of first n natural numbers which are divisible by 3 or 5
	int calculateSum()
	{
		int n;
		System.out.println("Enter a number : ");
		n=sc.nextInt();int i=1,sum=0,count=0;
		while(i>0)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum+=i;
				count++;
			}
			if(count==n)
				break;
			i++;
		}
		
		return sum;
	}

}
