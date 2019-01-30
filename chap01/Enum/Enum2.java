
class MyEnum{
	
	int index;
	
	String name;
	
	private MyEnum(int index, String name){
		this.index=index;
		this.name=name;
	}
	
	public static final MyEnum TYPE1 = new MyEnum(0,"TYPE1");
	
	public static final MyEnum TYPE2 = new MyEnum(1,"TYPE2");
	
	
	public String toString(){
		return name;
	}
	
}

class Employee{
	
	MyEnum myEnum = MyEnum.TYPE1;
	
	@Override
	public String toString(){
		return "myEnum : "+ myEnum;
	}
}


class Enum2{
	
	public static void main(String...args){
		
		Employee emp = new Employee();
		
		System.out.println(emp);
	}
}