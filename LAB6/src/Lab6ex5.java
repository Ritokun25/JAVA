import java.util.*;
public class Lab6ex5 {
	 boolean isPositiveString()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
		 String str= sc.next();
		 sc.close();
		 char arr[]=new char[str.length()];
		 arr=str.toLowerCase().toCharArray();
		 for(int i=0;i< arr.length -1;i++)
		 {
			 if  (  (int)arr[i] > (int)arr[i+1] )
				 return false;
				 
		 }
		 return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab6ex5  obj =new Lab6ex5();
		System.out.println("Is the String Positive ??   "+obj.isPositiveString());
	}

}
