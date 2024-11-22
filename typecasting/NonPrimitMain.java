package typecasting;

public class NonPrimitMain {

	public static void  main(String[] args) {
		NonPrimitive np=new NonPrimitive1(); //upcasting
		System.out.println(np.uname);
		System.out.println(np.students);
//		System.out.println(np.workers);
		NonPrimitive1 ch=(NonPrimitive1) np;
		System.out.println(ch.collegeString);
		System.out.println(ch.workers);
		System.out.println(ch.uname);
		System.out.println(ch.students);
		
	}

}
