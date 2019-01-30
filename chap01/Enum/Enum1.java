
enum TrafficSignal{
	RED, YELLOW, GREEN
	
}

class ProductType{
	
	enum Type{ FOOD, ELECTRONIS};
}

enum ColaFlavour{
	
	REGULAR, SWEET, DIET;
}

class Cola{
	
	protected enum ColaSize {SMALL, MED, LARGE}

	ColaSize size;
	
	ColaFlavour colaFlavour;
	
	ProductType.Type type= ProductType.Type.FOOD;
	
	public String toString(){
		return "size : "+size + ", flavour : "+colaFlavour;
	}
}

class Enum1{
	
	public static void main(String...args){
		
		//TrafficSignal signal = new TrafficSignal();
		//System.out.println("signal : "+signal);
		
		Cola cola = new Cola();
		cola.size = Cola.ColaSize.MED;
		cola.colaFlavour = ColaFlavour.DIET;
		
		System.out.println(cola);
		
	}
}

