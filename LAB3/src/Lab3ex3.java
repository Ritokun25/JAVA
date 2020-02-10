import java.util.Arrays;
import java.util.Scanner;

public class Lab3ex3 {

	void getSorted()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("How many element do you want?");
		int n=sc.nextInt();
		String str;
		
		int arr[]=new int[n];
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			str=Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			s[i]=sb.toString();
		}
		Arrays.sort(s);
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(s[i]);
			System.out.print(arr[i] + " ");
		}
			
		
	}
	public static void main(String args[])
	{
		Lab3ex3 obj =new Lab3ex3();
		obj.getSorted();
	}
}

