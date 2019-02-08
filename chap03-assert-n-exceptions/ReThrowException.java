import java.sql.*;
import java.io.*;

class A{
	
	
	public static void method1(){
		
		try{
			method2();
		}catch(IOException ex){
			//throw ex;
		}
		
	}
	
	public static void method2() throws FileNotFoundException{
					
		
	}
	
	public static void main(String[] args){
		method1();
	}
}
