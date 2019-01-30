/* calling same name static method in subtype */
import static java.lang.System.*;

class A{
	
	static void doStuff(){
		
		out.println("A : doStuff");
	}
	
	public static void main(String...args){
			//A b = new B();
			//b.doStuff();
			B.doStuff();
	}
}

class B extends A{
	
	static void doStuff(){
		A.doStuff();
		out.println("B : doStuff");
	}
	
}

