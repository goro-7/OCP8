import static java.lang.System.*;

class A{
	
	void print(){
		out.println("A::print");
	}
}

class B extends A{
	
	void print(int i){
		out.println("B...print");
	}
	
	public static void main(String...args){
		B b = new B();
		b.print();
	}
}


class Parent{
		
		
}

class Child extends Parent{
	
}

class Demo{
	
	static void convert(Parent p){
		out.println("method which accepts Parent");
	}
	
	static void convert(Child c){
		out.println("method which accepts Child");
	}
	
	public static void main(String...args){
		
		Parent p = new Child();
		
		Demo d = new Demo();
		d.convert(p);
	}
}
