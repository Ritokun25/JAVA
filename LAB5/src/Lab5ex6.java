import com.cg.eis.exception.EmployeeException;
import java.util.*;
public class Lab5ex6 {


	void check()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		try
		{
			int salary=sc.nextInt();
			sc.close();
			if(salary< 3000)
				throw new EmployeeException();
			else
			{
				
				System.out.println("Your salary is "+salary);
			}
		}

		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab5ex6 obj =new Lab5ex6();
		obj.check();
	}

}
