interface X{
	
	default void doIt(){
		System.out.println("X.doIt");
	}
	
	static void someMethod(){
		System.out.println("X.someMethod");
	}
}

interface Y{

	default void doIt(){
		System.out.println("Y.doIt");
	}
}

class A implements X,Y{

	public void doIt(){
		System.out.println("A.doIt");
		X.super.doIt();
		Y.super.doIt();
		X.someMethod();
	}
	
	public static void main(String...args){
		
		A a = new A();
		a.doIt();
	}
}