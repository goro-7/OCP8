import java.io.*;
import java.sql.*;

class A{
	
	public static void main(String...args){
		
		try{
			method1();			
		}catch(SQLException | RuntimeException  ex ){
			// ex = new Exception(); cannot assign object to multi catch parameter
		}
		
	}
	
	static void method1() throws SQLException{
		
	}
	
}

class B{
	
	class C extends Exception{
		
	}
	
}