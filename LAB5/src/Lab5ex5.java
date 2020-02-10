import java.util.*;

class AgeException extends Exception
{
	AgeException(){
      super("Age should be above 15");
	}
}


public class Lab5ex5 {

	void checkAge()
	{
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter the age");
			int age=sc.nextInt();
			if(age<=15)
				throw new AgeException();
			else
				System.out.println("VALID AGE IT IS");

		}	
		catch(AgeException e)
		{
			System.out.println(e);
		}

	}
	public static void main(String args[])
	
	{
		Lab5ex5 obj =new Lab5ex5();
		obj.checkAge();
	}

}
