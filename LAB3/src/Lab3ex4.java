import java.util.Scanner;

public class Lab3ex4 {

	void getSecondSmallest(int a[])
	{
		int temp;
		for (int i=0;i <a.length - 1 ;i++)
		{
			for(int j=0;j<a.length -1;j++)
			{
				if ( a[j] <= a[j+1])
					continue;
				else
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
			temp=0;
		}

		for(int i =0;i< a.length ;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println("The Answer is " +a[i+1]); 
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want?");
		int ele =sc.nextInt();
		int arr[]=new int[ele];
		System.out.println("Enter elements");
		for(int i=0;i< ele;i++)
			arr[i] = sc.nextInt();
		Lab3ex4 obj = new Lab3ex4();
	obj.getSecondSmallest(arr);
		sc.close();
	}

}
