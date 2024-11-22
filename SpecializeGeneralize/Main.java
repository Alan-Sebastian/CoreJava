package SpecializeGeneralize;


public class Main {

	static void choose(Pen p) {
		if(p instanceof SketchPen) {
			SketchPen sk=(SketchPen) p;
			sk.write();
		}
		else if(p instanceof InkPen){
			InkPen ip=(InkPen) p;
			p.write();
		}
		else {
			System.out.println("invALID");
		}
	}
	public static  void main(String[] args) {
		choose(new SketchPen());
	}
}
