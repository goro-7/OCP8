
enum Designation{
	
	GET("Graduate Engineer Trainee","A00"), 
	SE("Software Engineer","A11");	
	
	Designation(String fullForm, String grade){
		this.fullForm=fullForm;
		this.grade=grade;
	}
	
	private String fullForm;
	
	private String grade;
	
	public float calculateBonus(float salary){
		// complex bonus calculation
		return (float)Math.random()*salary;
	}
}

class Payroll{
	
	public static void main(String...args){
		
		Designation d = Designation.SE;
		System.out.println(Designation.values());
		System.out.println(d.SE.calculateBonus(1000));
	}
}