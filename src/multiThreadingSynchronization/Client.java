package multiThreadingSynchronization;

public class Client {

	public static void main(String[] args) {

		A obj1 = new A();
		A obj2 = new A();
		
		obj1.fun1();obj1.fun2();
		obj1.fun1();obj2.fun1();
		obj2.fun2(); obj2.fun3();
		obj1.fun2();obj2.fun2();
	}
}