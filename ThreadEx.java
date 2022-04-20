package example;

public class ThreadEx extends Thread{
	public void run() {
		System.out.println("started");
	}
	
	public static void main(String args[])
	{
		System.out.println("welcome");
		ThreadEx tt=new ThreadEx();
		tt.start();
	}
}
