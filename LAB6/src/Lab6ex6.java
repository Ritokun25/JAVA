import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Lab6ex6 {
	
	void operationsDate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in the format YYYY/MM/DD");
		String dt = sc.next();
		String dat[]=new String[3];
		dat=dt.split("/");
		int year = Integer.parseInt(dat[0]);
		int month = Integer.parseInt(dat[1]);
		int day = Integer.parseInt(dat[2]);
		
		LocalDate ld = LocalDate.of(year,month,day);
		LocalDate ld1= LocalDate.now();
		Period ob = Period.between(ld1,ld );
		System.out.println("  Years : " + ob.getYears() + "  Months : "+ob.getMonths() + "  Days : "+ob.getDays()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6ex6 obj=new Lab6ex6();
		obj.operationsDate();
	}

}
