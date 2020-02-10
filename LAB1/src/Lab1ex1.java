import java.util.*;
public class Lab1ex1 {

	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1ex1 obj =new Lab1ex1();
System.out.println("IS THE NUMBER INCREASING ?? :  "+ obj.checkNumber()  );
	}
	
//to check whether the number is increasing number or not
	boolean checkNumber()
	{
		System.out.println("Enter a number : ");
		int num = sc.nextInt(); int lastDigit,prevDigit;
		int n = num;
		while(n>0)
		{
			lastDigit = n % 10 ;
			n = n/10;
			prevDigit = n % 10 ;
			if(lastDigit < prevDigit)
				return false;
		}
		return true;
	}
	
	
}
