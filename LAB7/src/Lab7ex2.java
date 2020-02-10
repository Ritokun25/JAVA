import java.util.*;

public class Lab7ex2 {


	LinkedHashMap<String,Integer>countCharacter(char arr[])
	{
		LinkedHashMap<String,Integer> lhm =new LinkedHashMap<String,Integer>();

		for(int i=0;i<arr.length;i++)
		{
			String s= Character.toString(arr[i]);
			if(!lhm.containsKey(s))
				lhm.put(s,1);
			else
				lhm.put(s, (lhm.get(s)+1));

		}
		return lhm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		Lab7ex2 obj =new Lab7ex2();
		System.out.println(obj.countCharacter(word.toCharArray()));
		sc.close();

	}

}
