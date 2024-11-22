package constructorchaining;

public class Explicit2 extends Explicit1{

	Explicit2(String school){
		super(100);
		System.out.println("at "+school);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Explicit2("gshss meladoor");

	}

}
