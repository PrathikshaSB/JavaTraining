package example;
import java.util.*;

public class arr_3 {

	public static void main(String args[])
	{
		String s="zeetech";
		char arr[]=s.toCharArray();
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
				break;
		}
		if(i!=arr.length)
		System.out.println("present, index= "+i);
		else
			System.out.println("not present");
		
	}
}
