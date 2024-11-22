package methodChaining;



public class MethodChaining {
//	add
	int a;
	int b;
	public MethodChaining  add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("addition of two number is:"+(a+b));
        return this;
	}
	public void substraction(int a,int b) {
		System.out.println("substraction of two number is:"+(a-b));
		multiplication(a,b);
		
	}
	public  void multiplication(int a,int b) {
		System.out.println("multiplication of two number is:"+(a*b));	
	}
	public static void main(String[] args) {
		MethodChaining m=new MethodChaining();
		m.add(50,40).substraction(100,80);
		
}
}
