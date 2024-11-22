package Blocks;

public class NonStaticBlock {
static int empid;
String name;


static{
	String address="payyappilly";
}
{
	empid=54;
	String name="alan";
}

{
	empid=90;
     name="seban";
     String address="vettiyadan";
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(empid);	
		NonStaticBlock  nBlock=new NonStaticBlock();
		System.out.println(nBlock.empid);
		System.out.println(nBlock.name);
		

	}

}
