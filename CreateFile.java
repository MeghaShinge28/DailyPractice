import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("hello.txt");
		System.out.println("Created Hello File Sucessfully....");
		String str="DEEPTECH JAVA CLASS";
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		for(int i=0;i<str.length();i++)
		    fw.write(str.charAt(i));
		
		fw.close();
		FileReader fr=new FileReader("hello.txt");
		int i;
		while((i=fr.read()) >0)
		{	
			System.out.print((char)i);
		}
		}
}