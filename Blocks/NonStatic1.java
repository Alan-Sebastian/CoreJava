package Blocks;

public class NonStatic1 {
 String name;
 int age;
 static int salary;
 
 {
	 name="alan";
	 age=40;
	 salary=4000;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic1  n=new NonStatic1();
		System.out.println(n.name);
		System.out.println(n.age);
		System.out.println(salary);

	}
//	
	{
		 name="alwin";
		 age=30;
		 salary=100000;
	 }
//	
	{
		 name="gillex";
		 age=24;
	 }

}
