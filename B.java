package example;

class A1{
	void fun(){int a=100;}
}
public class B extends A1{
	void fun(){int a=1000;}
	public static void main(String args[]){
		A1 a=new A1();
		A1 a1=new B();
		//B a2=new A1();
		B a3=new B();}
}


