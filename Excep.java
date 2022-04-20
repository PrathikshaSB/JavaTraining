package example;

class MyException extends Exception{
	MyException(){
		System.out.println("myyyy");
	}
}

public class Excep {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}