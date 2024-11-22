package constructorchaining;

public class Super2  extends Super1{

	Super2(String school){
		System.out.println("at "+school);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Super2("gshss meladoor");

	}

}
