
class Vechile{
	
	public static void start(){
		System.out.println("Vechile static method start");
	}
		
}

class Bike extends Vechile{
	
	public static void start(){
		System.out.println("Bike static method start1");
	}
	
		
}

class BikeDemo{
	
	public static void main(String...args){
		
		Vechile bike = new Bike();
		bike.start();
	}
}