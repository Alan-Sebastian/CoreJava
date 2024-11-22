package Constructor;

public class ThisExample {
	int cost;
	String lapName;
	String color;
	ThisExample(int cost,String lapName,String color){
		this.lapName=lapName;
		this.cost=cost;
		this.color=color;
		  System.out.println("lapname:"+lapName+" cost:"+cost+" color:"+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  new ThisExample(4000,"aspire3","black");
			  new ThisExample(50000,"lenovo","white");
			  new ThisExample(80000,"mac","grey");
	}

}
