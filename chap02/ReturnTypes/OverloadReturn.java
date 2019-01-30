
class A{

	public void doIt(){
		
		System.out.println("A.doIt");
	}
}

class B extends A{
	
	String doIt(int i) throws Exception{
		System.out.println("B.doIt");
		return String.valueOf(i);
	}
	
	public static void main(String...args) throws Exception{
		
		B b = new B();
		b.doIt();
		b.doIt(129);
	}
}