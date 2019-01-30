import static java.lang.System.*;
import java.util.Arrays;

interface Flyable{
	
	default void fly(){
		out.println("Flyable ... fly");
	}
}

class Rocket implements Flyable{
	
	
	public void fly(){
		Flyable.super.fly();
		out.println("Rocket...flying");
	}
	
	public static void main(String...args){
		
		Rocket rocket = new Rocket();
		rocket.fly();
	}
}

interface X{
	
	default void method3(){
		out.println("X::method3");
	}
	
	static void method4(){
		out.println("X::method4");
	}
}

class A implements X{
	
	void method1(){
		out.println("A instance method1");
	}
	
	static void method2(){
		out.println("A static method2");
	}
}

class B extends A{
	
	public static void main(String...args){
		B b = new B();
		b.method1();
		b.method2();
		b.method3();	
		
		//A.method4(); static methods in interface are not inherited
	}
}


class Fruit{
	
	private void doIt(){
		out.println("Fruit..doIt");
	}
	
}

class Apple extends Fruit{
	
	public void doIt(){
		out.println("Apple...doIt");
	}
	
	public static void main(String...args){
		
		Apple a = new Apple();
		a.doIt();
	}
}