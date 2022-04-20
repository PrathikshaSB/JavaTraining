package example;
import java.util.*;
public class Array_ex {
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+", ");
		
	}
}
