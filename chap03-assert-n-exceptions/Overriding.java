

class A{
	
	private final void method1(){
		
		System.out.println("method1 in A");
	}
}


class B extends A{
	
	void method1(){
		System.out.println("method1 in B");
	}
}