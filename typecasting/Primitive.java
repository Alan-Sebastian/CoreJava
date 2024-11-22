package typecasting;

public class Primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1000;
		double f=num;//widening
		long l=num;//widening
		System.out.println(f);
		System.out.println(l);
		
//		narrowing
		long number=50000;
		int n=(int)number; //narrowing
		System.out.println(n);
		

	}

}
