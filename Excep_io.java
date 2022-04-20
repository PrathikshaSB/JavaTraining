package example;
import java.io.*;
public class Excep_io {
	public static void main(String args[])
	{
		try{
			FileInputStream f=new FileInputStream("jhds.txt");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
