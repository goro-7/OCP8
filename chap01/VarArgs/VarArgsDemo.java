
class VarArgsDemo{
	
	public static void doIt(int... arr){
		
		for(int i : arr)
			System.out.println(i);
	}
	
	public static void main(String... args){
		System.out.println("calling with no args");
		doIt();
		System.out.println("calling with 1 number");
		doIt(1);
		System.out.println("calling with 1,2,3,4");
		doIt(1,2,3,4);
		System.out.println("calling with arr");
		doIt(new int[]{2,332,41});
	}
}