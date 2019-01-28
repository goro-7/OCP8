

enum ColaType{
   
   REG(4000), DIET(500), JEERA(3500){

       public String getLidType(){
		return "B";
       }
   };
   
   private int calories;
	
   public int getCalories(){
   	return calories;
   }

   public String getLidType(){

	return "A";
   }
	
   ColaType(int cal){
     this.calories=cal;
   }

}

class EnumDemo{
	

	public static void main(String... args){

		ColaType colaType = ColaType.JEERA;
		
		System.out.println(colaType.getCalories());
		System.out.println(colaType.getLidType());
	}

}