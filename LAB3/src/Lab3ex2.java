import java.util.Arrays;
import java.util.Scanner;
public class Lab3ex2 {
	void getArray()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many elements you want");
		int n=sc.nextInt();
		String s;
		String arr[]=new String[n];
System.out.println("enter words");
		for(int i=0;i<n;i++)
		{
			arr[i] =sc.next().toLowerCase();
			
		}
		Arrays.sort(arr);


		if(n % 2 ==0)

		{	
			for (int i=0;i<n;i++)
			{
				
				if(i<= ((n/2)-1))
					arr[i]=arr[i].toUpperCase();
				
			}
		}
		else
		{
			for (int i=0;i<n;i++)
			{
				
				if(i<= ((n/2)))
					arr[i]=arr[i].toUpperCase();	
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab3ex2 obj =new Lab3ex2();
		obj.getArray();
	}

}