package constructorchaining;

public class This {

	This(){
		this(10,'m');
		System.out.println("hello iam non parameterized");
	}
	
	This(int num,char m){
		System.out.println("num:"+num+"gender:"+m);
	}
	
	This(int num){
		this();
		System.out.println("hello iam  parameterized");
	}
	
	This(String name){
		this(50);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This("alan");

	}

}
