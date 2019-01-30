/*
if two methods have same signature then either both should be static or both should be instance method. One static and one
instance combination doesn't work
*/
class A{
	
	static void doIt(){
		
		System.out.println("A>>doIt");
	}
}

class B extends A{
	
	static void doIt(){
		
		System.out.println("B>>doIt");
	}
	
	public static void main(String...args){
		
		//A a = new B();
		//a.doIt();
	}
}

class Foo{
	
	private void eat(){
		System.out.println("Foo eating...");
	}
}

class Pheebe extends Foo{
	
	void eat(){
		
		System.out.println("Pheebe eating...");
	}
	
	public static void main(String...args){
		
		//Foo foo = new Pheebe();
		//foo.eat();
		
		Pheebe p = new Pheebe();
		p.eat();
	}
}

/* calling super type method eventhough it is overridden */

class Vechile{
	
	void start(){
		System.out.println("Vechile started");
	}
}


class Car extends Vechile{
	
	void start(){
		super.start();
		System.out.println("Car started");
		super.start();
	}
	
	public static void main(String...args){
		 
		 Vechile car = new Car();
		 car.start();
	}
}
