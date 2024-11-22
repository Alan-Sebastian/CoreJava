package Instance;


public class Solution{
static void display(India obj) {
	if(obj instanceof Kerala) {
		     Kerala k=(Kerala) obj;
		System.out.println(k.pm+" "+k.cm);	
	}
	else if(obj instanceof Karnataka) {
		System.out.println("alan");
		 Karnataka KK=(Karnataka) obj;
			System.out.println(KK.pm+" "+KK.cm);	
	}
else if(obj instanceof Goa) {
	 Goa g=(Goa) obj;
		System.out.println(g.pm+" "+g.cm);
	}
}
	public static  void main(String[] args) {
		display(new Kerala());		
		display(new Karnataka("sjjs"));		
	}
}
