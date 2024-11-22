package inheritence;

public class Single2 extends Single1{

	String sonBike="ktm 390";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single2 s2=new Single2();
		System.out.println(s2.fatherBike);
		System.out.println(s2.sonBike);
		Single1 s1=new Single1();
		System.out.println(s1.fatherBike);
//		System.out.println(s1.sonBike); 
	}

}
