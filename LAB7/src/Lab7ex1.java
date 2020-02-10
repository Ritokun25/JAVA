import java.util.*;
public class Lab7ex1 {
	
		
	//function to sort hashmap
	
	public static List<String>getValues(HashMap<Integer,String>hm)
	{
		List <String> li = new ArrayList<String>(hm.values());
		Collections.sort(li);
		return li;
	}

	 public static void main(String args[])
	 {
		
		Scanner sc =new Scanner(System.in);
		HashMap<Integer,String> hm1 =new HashMap<Integer,String>();
		System.out.println("How many elements do you want");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			hm1.put(id, name.toLowerCase());
			
		}
		sc.close();
		
		
		System.out.println(getValues(hm1));
		
	 }
		
	
	
}
