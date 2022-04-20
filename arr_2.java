package example;
import java.util.*;
public class arr_2 {

	public static void main(String args[])
	{
//		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<10;i++)
			arr.add(sc.nextInt());
		System.out.println("enter element to search");
		int s=sc.nextInt();
		if(arr.indexOf(s)==-1)
			System.out.println("not present");
		else
			System.out.println("present");
	}
}
