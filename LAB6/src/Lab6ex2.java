import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab6ex2  {
	
	 static void readFile()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try {
			 fr =new FileReader("filecorona.txt.txt");
			 br= new BufferedReader(fr);
		int i=1;
			String str = br.readLine();
			while(str != null)
			{
				System.out.println(i++ +"." + str);
				str = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				fr.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
	}

	public static void main(String args[])
	{
		readFile();
	}
}
