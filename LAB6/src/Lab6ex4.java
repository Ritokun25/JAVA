import java.io.File;
import java.util.*;
public class Lab6ex4 {

	void fileOperations()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename =sc.next();
		File f=new File(filename);
		StringTokenizer st=new StringTokenizer(filename,".");
		System.out.println("File Exists : "+f.exists());
		System.out.println("Is file readable ?? "+f.canRead());
		System.out.println("Is file writable ?? "+f.canWrite());
		String last="";
		while(st.hasMoreTokens())
		{
			last=st.nextToken();
		}
		if(f.exists())
		{
			System.out.println("File type is : "+last);

			System.out.println("File length : "+f.length());
		}
		else
		{
			System.out.println("File type is : "+null);

			System.out.println("File length : "+null);
		}

		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab6ex4 obj =new Lab6ex4();
		obj.fileOperations();
	}

}
