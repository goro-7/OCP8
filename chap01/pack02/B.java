package pack02;

import pack01.A;


class B extends A{
	
	
	public static void main(String...args){
		
		B b = new B();
		System.out.println(b.var1);
	}
	
}

class C extends B{
	
	public static void main(String...args){
		
		C c = new C(); c.var1=10;
		System.out.println(c.var1);
		
	}
	
}