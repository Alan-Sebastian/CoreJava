package methodOverloading;

public class MethodOverloading {

	static String method(String username) {
		return username;
	}
//ctrl+shift+f
	void method(long phonenum) {
		System.out.println(phonenum);
	}

	void method(int age, String name) {
		System.out.println(age + " " + name);
	}

	void method(String name, int age) {
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.method("alan", 19);

	}

}
