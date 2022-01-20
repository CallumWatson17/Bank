package bank;

public class Account {
	
	private int accountNumber;
	private int pin;
	private double avaiablebalance;
	private double totalBalance;
	private int admin;
	private String userName;
	
	public Account(String userName, int AccountNumber, int thePin, double theAvaiableBalance, double theTotalBalance, int isAdmin) {
		setUsername(userName);
		setAccountNumber(theAccountNumber);
		setPin(thePin);
		set
	}
	
	public boolean validatePin(int userPin) {
		if(userPin == getPin()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getAvailableBalance()
	{
		return avaiablebalance;
	}
	
	public double getTotalBalance() {
		
		
		
		return totalBalance;
	}
	
	HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	

}
