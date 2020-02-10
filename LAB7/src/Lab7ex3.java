import java.util.*;
public class Lab7ex3 {

	 public static LinkedHashMap<Integer,Double>getSquares(int arr[])
	{
		LinkedHashMap<Integer,Double> lhm =new LinkedHashMap<Integer,Double>();
		for(int i=0;i<arr.length;i++)
		{
			lhm.put(arr[i], (Math.pow(arr[i],3)));
		}
		return lhm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("how many elements do you want??");
		int n=sc.nextInt();
		int aaray[]=new int[n];
		for(int i=0;i<n;i++)
			aaray[i]=sc.nextInt();
		System.out.println(getSquares(aaray));
	}

}
