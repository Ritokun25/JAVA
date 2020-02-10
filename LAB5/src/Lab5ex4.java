import java.util.*;
 class MyException extends Exception
{
	MyException()
	{
		super("Invalid entry ....First name or Last name cannot be blank");
		
	}
}

public class Lab5ex4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter First name");

try
{
	String fname =sc.nextLine();
	System.out.println("Enter Last name");
	String lname=sc.nextLine();
	sc.close();
	if(fname.length() ==0 || lname.length()==0)
	throw new MyException();
	else
		System.out.println("The full name is--->"+ fname+" "+lname);
}
catch(MyException e)
{
	System.out.println(e + " Exception occurred");
	
}
	}

}
