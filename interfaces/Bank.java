package interfaces;

public class Bank implements Atm{
	int bankBalance=1000;
	@Override
	public void deposit(int deposit) {
		bankBalance=bankBalance+deposit;
		System.out.println(deposit+"rupess deposited");
		
	}
	@Override
	public void withdrawal(int withdraw) {
		bankBalance=bankBalance-withdraw;	
		System.out.println(withdraw+":rupess withdrawed");
	}
	@Override
	public void balance() {
		System.out.println("balance:"+bankBalance);	
	}

}
