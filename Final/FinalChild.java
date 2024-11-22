package Final;

//public class FinalChild extends FinalParent { cnnot inherit final class
public  class FinalChild extends FinalParent{

//	@Override
//	final  void work() {
//		System.out.println("hello iam overrided working");
	//override cannot be done
//		
//	}
	void developer() {
	super.work();
	System.out.println("developing");
	}
	
	final String name="alan";
	String name="fjj";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalChild fChild=new FinalChild();
		fChild.developer();
	

	}

}
