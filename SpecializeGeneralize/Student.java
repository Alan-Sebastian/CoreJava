package SpecializeGeneralize;

public class Student {

	static University callAuthority(int ch) {
		if(ch==1) {
			return new Department();
		}
		else {
			return new College();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University un=callAuthority(2);
		un.call();

	}

}
