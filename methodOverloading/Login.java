package methodOverloading;

public class Login {
	
	static void pswd(String uname,int pwd) {
		System.out.println("hello "+uname);
	}
static void pswd(int phoneno,String pwd) {
	System.out.println("hello "+phoneno);
	}
static void pswd(String email,long pwd) {
	System.out.println("hello "+email);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pswd("alansebastian_vettiyadan",12345678);

	}

}
