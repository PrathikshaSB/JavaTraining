package example;

public class RunnableEx implements Runnable {

	public void run() {
		System.out.println("new thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main thread");
		RunnableEx t=new RunnableEx();
		Thread t1=new Thread(t);
		t1.start();
	}

}
