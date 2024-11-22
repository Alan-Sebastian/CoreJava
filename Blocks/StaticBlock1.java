package Blocks;

public class StaticBlock1 {
	static int sal=400;
	static String comp;

	static {
		sal=25000;
		comp="tcs";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("company:"+comp);
		System.out.println("salary:"+sal);

	}
	static {
		sal=75000;
		comp="mahindra";
	}
	static {
		sal=105000;
		comp="google";
	}

}
