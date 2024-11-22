package objectCreation;

public class Mobile {
	int cost;
	String brand;
public static void main(String[] args) {
	
Mobile m1=new Mobile();
m1.cost=20000;
m1.brand="realme";
System.out.println(m1.cost);
System.out.println(m1.brand);
Mobile m2=new Mobile();
m2.cost=25000;
m2.brand="redmi";
System.out.println(m2.cost);
System.out.println(m2.brand);
}
}
