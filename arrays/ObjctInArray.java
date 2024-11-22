package arrays;



public class ObjctInArray {

	int id;
	String name;
	ObjctInArray(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjctInArray obj1=new ObjctInArray(50,"alan");
		ObjctInArray obj2=new ObjctInArray(40,"adhal");
		
		ObjctInArray[] stud= {obj1,obj2};
		
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i].id+" "+stud[i].name);
		}

	}

}
