package example;
//import java.math.*;
public class Arr_9 {

	public static void main(String args[])
	{
		int arr[]=new int[10];
		int c=0;
		for(int i=0;i<arr.length;i++)
		{	
//			arr[i]=(int)Math.random();
			arr[i]=(int)(Math.random() * 100) + 1;
			if(arr[i]%2==0)
				c++;
		
		}
		for(int i=0;i<10;i++)
		System.out.println(arr[i]);
		System.out.println(c);
	}
}
