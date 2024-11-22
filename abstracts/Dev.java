package abstracts;

public class Dev extends Employee{
	@Override
	void work() {
		System.out.println("developing the software");
		
	}
	@Override
	void tasks() {
		System.out.println("pending task in login page");
	}
	public static void main(String[] aargs) {
		Dev dev=new Dev();
		dev.work();
		dev.tasks();	
	}
}

