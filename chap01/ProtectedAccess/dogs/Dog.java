package dogs;

import parent.Animal;

class Dog extends Animal{
	
	public void run(){
		System.out.println("dog run");
	}
	
	public void doIt(){
		
		//Animal animal = new Animal();
		//animal.run();
		
	}
}

class ToyDog extends Dog{
	
	public void smile(){
		run();
	}
	
}

class DogDemo{
	
	public static void main(String [] args){
		
		Dog dog = new Dog();
		dog.run();
		
	}
}