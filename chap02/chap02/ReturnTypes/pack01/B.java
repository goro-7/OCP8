package pack01;

class A{

	public void doIt(){
		
		System.out.println("A.doIt");
	}
}

public class B extends A{
	
	String doIt(int i) throws Exception{
		System.out.println("B.doIt");
		return String.valueOf(i);
	}
}