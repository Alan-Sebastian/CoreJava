package Constructor;

public class ParameterizedConstructor {

	ParameterizedConstructor(int mark,String name){
		System.out.println("mark of "+name+" is "+mark);
		
	}
//	non-parameterized constructor
ParameterizedConstructor(){
	System.out.println("iam not parameterized");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ParameterizedConstructor(99,"alan");
		new ParameterizedConstructor();
		

	}

}
