package statickeyword;



public class StaticKey {
	
	static String name="alan";
	static int age=35;
	static String address="vettiyadan house";
	static int percentage=90;

	
	public static void main(String[] args) {
		int age=50;
		System.out.println(name);
		System.out.println(StaticKey.age);
		System.out.println(age);
		System.out.println(StaticKey.percentage);
		System.out.println(address);
		
	}

}
