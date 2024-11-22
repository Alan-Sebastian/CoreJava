package objectCreation;

public class Obj {
	String name="alan";
	static int  age=30;
	long sal;
	String company="infosys";
	char gen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Obj obj=new Obj();
		System.out.println(obj.name);
		System.out.println(Obj.age);
		System.out.println(obj.gen); //default value of char
		System.out.println(obj.sal); //default value of int
		System.out.println(obj.company); //default value of string
		
		

	}

}
