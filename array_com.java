package example;
import java.util.Arrays;

public class array_com {
	
	public static void main(String main[])
	{
		int a[]= {10,20,30,40};
		int b[]= {60,70,40,90};
		int var=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if (b[i]==a[j])
					{var=b[i];
					break;}
			}
		}
		System.out.println(var);
	
	}
}
