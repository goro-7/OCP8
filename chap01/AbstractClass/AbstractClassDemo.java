
abstract class Car {
	
	private String name;
	
	private int colour;
	
	protected Car(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void start(){
		System.out.println(getName() + " started ...");
	}
	
	public abstract void stop();
	
}


class SuvCar extends Car{
	
	SuvCar(){
		super("SuvCar");
	}
	
	@Override
	public void stop(){
		System.out.println(getName() +  " stopped ...");
	}
	
}
class CarDemo{
	
	public static void main(String [] args){
		
		Car suvCar = new SuvCar();
		suvCar.start();
		suvCar.stop();
		
	}
	
}