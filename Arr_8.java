package example;

public class Arr_8 {

	public static void main(String args[])
	{
		String s="zeetech";
		String str="";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				str+='z';
			}
			else
				str+=c;
		}
		System.out.println(str);
	}
}
