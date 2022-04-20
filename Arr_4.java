package example;

//public class Arr_4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int c=0;
//		String str="zeetech";
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)=='e')
//				c++;
//		}
//		System.out.println(c);
//
//	}
//
//}


import java.util.*;

 class Arr_4 {

	public static boolean search1(int[] arr,int x,int low,int high)
	{
	
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return true;
			else if(arr[mid]<x)
				search1(arr,x,mid+1,high);
			else 
				search1(arr,x,low,mid-1);
		}
		return false;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,5,3,78,6,9,34,52};
		
		int x=sc.nextInt();
		if(search1(arr,x,0,arr.length-1))
			System.out.println("Yes");
	}




}
