package arrays;

public class ArrDeclration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; //array declaration
		arr=new int[3]; //array creation
		
//		array intialization
		arr[0]=30;
		arr[1]=90;
		arr[2]=40;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+" ");
		}
//		array declaration and initialization
		System.out.println(" ");
		int[] ar= {1,2,3,4,5};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(+ar[i]+" ");
		}
		

	}

}
