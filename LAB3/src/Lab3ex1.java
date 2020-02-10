import java.util.Arrays;
import java.util.Scanner;

public class Lab3ex1 {

char arr[];
 void getFrequency()
 {
	 Scanner sc =new Scanner (System.in);
	 System.out.println("Enter the string");
	 String str=sc.next().toLowerCase();
	 arr=str.toCharArray();
	 int hash[]=new int[26];
	 Arrays.fill(hash, 0);
	 for (int i=0; i<arr.length;i++)
	 {
		 hash[((int)arr[i] - 97)]++;
		 
	 }
	 
	 for (int i=0;i<26;i++)
	 {
		 if(hash[i] != 0)
		 System.out.println("The character " + (char)(97+i) + " occured " + hash[i] + " times");
	 }
 }

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3ex1 obj =new Lab3ex1();
		obj.getFrequency();
	}

}

