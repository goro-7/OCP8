
interface Bounceable{
	
	void bounce();
}

interface Jumpable extends Bounceable, Runnable{
	
	void jumpLikeBounce();
}

class Pomodoro implements Jumpable{
	
	private int flag=1;
	
	public void bounce(){
		System.out.println("bounce");
	}
	
	public void jumpLikeBounce(){
		System.out.println("jumpLikeBounce");
	}
		
	public void run(){
		System.out.println("Run");
	}
		
	public static void main(String...args){
		
		Pomodoro p = new Pomodoro();
		p.bounce();
		p.jumpLikeBounce();
		
		p.flag=2;
		System.out.println(p.flag);
	}
}

