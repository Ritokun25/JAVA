import java.util.Scanner;
import java.util.regex.Pattern;

public class Lab6ex7 {

	boolean Validation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username of minimum 8 characters");
		String username=sc.next();
		sc.close();
		boolean bo = Pattern.matches("[A-Za-z]{8,}_job", username);
		if(bo==true)
		{
			System.out.println("Valid Entry");
			return true;
		}
		else
		{
			System.out.println("Invalid entry ----> username should be minimum of 8 characters and also check _job extenion");
			return false;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6ex7 obj =new Lab6ex7();
		obj.Validation();
	}

}
