package Constructor;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("hello iam constructor 1");
	}
	ConstructorOverloading(int num){
		System.out.println("hello iam constructor 2");
	}
	ConstructorOverloading(String name){
		System.out.println("hello iam constructor 3");
	}
	ConstructorOverloading(String name,int num){
		System.out.println("hello iam "+name+" constructor 4"+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverloading("alan",90);

	}

}
