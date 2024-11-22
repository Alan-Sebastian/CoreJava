package methodOverloading;



public class MainOverload {
void main() {
	System.out.println("hello iam overloaded main method");
}
void main(int age) {
	System.out.println("hello iam overloaded main method"+age);
}
void main(String name) {
	System.out.println("hello iam overloaded main method"+name);
}
void main(String name,int age) {
	System.out.println(name+"hello iam overloaded main method"+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello iam original main method");
		MainOverload m=new MainOverload ();
		m.main();

	}

}
