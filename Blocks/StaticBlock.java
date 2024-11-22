package Blocks;

public class StaticBlock {

//	int age=30;
//	String name="alan";
	static int age=30;
	static String name="ancy";
	
	static {
		 age=10;
		 name="alan";	
	}
	static {
		 age=20;
		 name="adhal";	
	}
	static {
		 age=10;
		 name="seban";	
	}
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(name);
		
	}
	static {
		int age=1;
		String name="alen jr";	
	}
	
}
