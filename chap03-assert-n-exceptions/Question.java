
class A{
	
	static String s;
	
	class B implements AutoCloseable{
		
		public void close(){
			s+="b";
		}
		
	}
	
}