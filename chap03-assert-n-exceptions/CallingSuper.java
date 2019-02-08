
class A{
	
	void doIt(){
		System.out.println("A.doIt");
	}
	
	static void doIt2(){
		System.out.println("A.doIt2");
	}
}

class B extends A{
	
	
	void doStuff(){
		super.doIt(); // invoking instance method of parent
		super.doIt2(); // invoking static method of super
		A.doIt2(); // invoking static method of super using class name
	}
	
}

interface X{
		
	default void doIt(){
		System.out.println("X.doIt");
	}
	
	static void doIt2(){
		System.out.println("X.doIt2");
	}
}

class Y implements X{
	
	public void doStuff(){
		//super.doIt();
		X.super.doIt();// calling default instance method in interface
		//X.super.doIt2(); cannot call static method of interface
		X.doIt2();// interface static method should invoked using interface name
	}
	
}