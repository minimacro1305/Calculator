package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		GreeterImpl g = new GreeterImpl("Team Joachim&Ulrike");

		//sayHello();
		sayGoodbye(g);
	}


	public static void sayGoodbye(GreeterImpl g){
		System.out.println("Good Bye, " + g + "!");
	}

}
