import java.sql.*;
import java.io.*;

class A{
	
	public static void main(String [] args) throws Exception{
		
		
		
		try(PrintWriter pw = new PrintWriter (new FileWriter("data.txt"))){
			pw.println("Hello World!");
			pw.print("Wass up");
			//throw new Exception("stop writing");
		}catch(IOException e){
			
		}
		
		B b2 = new B();
		
		try(B b = new B(); B b1 = new B();b2; C c= new C();){
			
		}
	}
	
}

class B implements AutoCloseable{
	
	
	@Override
	public void close(){
		System.out.println(toString() +" is closing");
	}
}

class C implements Closeable{
	
	public void close(){
		System.out.println(toString() +" is closing");
	}
}


class D implements AutoCloseable{
	
	private String name;
	
	D(String n){
		name = n;
	}
	
	@Override
	public void close(){
		
		throw new RuntimeException("exception on closing - "+name);
	}
	
	public static void main(String [] args){
		
		try(D d1 = new D("d1"); D d2 = new D("d2")){
			
			throw new RuntimeException("exception thrown in try block");
		}catch(Exception ex){
			throw new RuntimeException("exception thrown from catch block");
		}
	}
	
}