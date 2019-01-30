class Animal{


}

class Dog extends Animal{

	public static void main(String...args){
		
		//down casting
		Animal a1 = new Dog();
		Dog d = (Dog)a1;
				
		// upcasting 
		Dog d1 = new Dog();
		Animal a2 = d1; // implicit
		
		// wrong casting
		Animal a3 = new Animal();
		Dog d3 = (Dog)a3;
				
	}
	
}

class A{

	protected void run(){
	
		System.out.println("A.run()");
	}
}

class B extends A implements Runnable{
	
	public void run(){
		System.out.println("B.run()");
		//super.run();
	}
	
	public static void main(String...args){
		A a = new B();
		a.run();
		
	}
}