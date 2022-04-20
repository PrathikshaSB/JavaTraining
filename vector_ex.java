package example;
import java.util.*;

public class vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Vector<Integer> v=new Vector<>();
//		
//		v.add(10);
//		v.add(20);
//		v.add(30);
//		v.add(40);
//		v.add(50);
//		v.add(60);
//		v.add(70);
//		
//		System.out.println(v);
//		
//		v.remove(2);
//		System.out.println(v);
		
//		Queue<Integer> q=new PriorityQueue<Integer>();
//		q.offer(10);
//		q.offer(80);
//		q.offer(50);
//		q.offer(30);
//		System.out.println(q);
//		int v=q.peek();
//		System.out.println(q);
//		q.poll();
//		System.out.println(q);
//		q.remove();
//		System.out.println(q);
		
		
		Deque<Integer> q=new LinkedList<Integer>();
		q.offer(10);
		q.offer(80);
		q.offer(50);
		q.offer(30);
		System.out.println(q);
		int v=q.peek();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		

	}

}
