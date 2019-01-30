
interface Foo{

  static void doIt(){
    System.out.println("Foo.doIt");
  }
}

class FooImpl implements Foo{
	
	public static void  doIt(){
		
	}

}


class A{
 
 public static void someMethod1(){
    System.out.println("someMethod1 in A");   
 }

}

class B extends A{
	
	public static void someMethod1(){
		 System.out.println("someMethod1 in B");   
	}

}


class FooDemo{
  
  public static void main(String...args){
     
	 A a = new B();
	 a.someMethod1();
  }
}