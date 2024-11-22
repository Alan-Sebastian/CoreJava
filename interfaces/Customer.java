package interfaces;

import java.util.Scanner;

public class Customer {
	
	
	
	
	
	
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Atm objAtm=new Bank();
		while(true) {
		System.out.println("1.deposit\n2.withdrawal\n3.balance");
		int choice=sc.nextInt();		
		switch (choice) {
		case 1: {
			int amount=sc.nextInt();
			objAtm.deposit(amount);
			break;
		}
		case 2: {
			int amount=sc.nextInt();
			objAtm.withdrawal(amount);
			break;
		}
		case 3: {
			objAtm.balance();
			break;
		}
		default:{
			System.out.println("enter valid choice");
		}			
		}	
		}
	}
}
