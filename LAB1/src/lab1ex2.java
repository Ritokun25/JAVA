import java.util.*;

public class lab1ex2 {

	Scanner sc =new Scanner (System.in);
public static void main(String args[])
{
	lab1ex2 obj =new lab1ex2();
	System.out.println("IS the number power of 2 ???  " + obj.checkNumber());
}
boolean checkNumber()
	{
	System.out.println("Enter the number :  ");
		int n =sc.nextInt();
		int i;
		for(i=0;i<=n;i++)
		{
			if (n== Math.pow(2, i))
				return true;
		}
		return false;
	}

}
