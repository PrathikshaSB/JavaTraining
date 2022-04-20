package example;
import java.util.*;
public class assessment {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

		
//		Stack<Integer> s=new Stack<>();
//		
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		
//		System.out.println(s);
//		
//		s.remove(2);
//		
//		System.out.println(s);
		
		HashSet<Character> hs=new HashSet<>();
		
		String s="jhsdgaljf";
		String p="sdjfg";		
		for(int i=0;i<s.length();i++)
			hs.add(s.charAt(i));
		for(int i=0;i<p.length();i++)
		{
			if(hs.contains(p.charAt(i)))
				System.out.println(p.charAt(i));
		}
		hs.remove('j');
		System.out.println(hs);
	}
	
//	static {
//		System.out.println("jdf");
//		System.exit(1);
//	}

}
