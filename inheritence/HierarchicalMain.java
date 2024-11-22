package inheritence;

public class HierarchicalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchical2 h2=new Hierarchical2();
		
		System.out.println(h2.brandVehicle);
		System.out.println(h2.vehicleName);
		System.out.println(h2.cost);
		System.out.println("..............................");
		Hierarchical3 h3=new Hierarchical3();

		System.out.println(h3.brandVehicle);
		System.out.println(h3.colorBike);
		System.out.println(h3.brandVehicle);
	}

}
