import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab6ex3 {

	void getFile()
	{
		FileReader fr=null;
		BufferedReader br= null;
		try {
			String arr[]= new String[50];
			int lines=0;
			int words=0;
			int charac=0;
			fr =new FileReader("filecorona.txt.txt");
			br=new BufferedReader(fr);
			String s=br.readLine();
			while(s != null) 
			{
				lines++;
				arr=s.split(" ");
				words+= arr.length;
				for(int i=0;i<arr.length;i++)
					charac+= arr[i].length();
				s=br.readLine();
			}

			System.out.println("The number of lines = "+lines);
			System.out.println("The number of words = "+words);
			System.out.println("The number of characters = "+charac);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab6ex3 obj =new Lab6ex3();
		obj.getFile();
	}

}
