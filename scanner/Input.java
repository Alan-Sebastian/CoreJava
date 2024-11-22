package scanner;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the father's name:");
		String fname=sc.next();
		System.out.println("enter the age:");
		int age=sc.nextInt();
		System.out.println("enter the gender:");
		char g=sc.next().charAt(0);
		sc.close();
		System.out.println("----------------------------");
		System.out.println("age of "+name+" "+fname+" is "+age);
		

	}

}
