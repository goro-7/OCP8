
abstract interface Bounceable{
	
	public abstract void bounce();
}

class Ball implements Bounceable{
	
	@Override
	public void bounce(){
		System.out.println("bouncing . . .");
	}
	
	public static void main(String...args){
		
		Ball ball = new Ball();
		ball.bounce();
	}
}