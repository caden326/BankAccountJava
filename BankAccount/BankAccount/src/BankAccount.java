
public class BankAccount {
	//head
	public double checkingBalance;
	public double savingsBalance;
	
	public static double amountStored = 0;
	
	public static int numberOfaccounts = 0;

	
	//constructor
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		
		numberOfaccounts++;
		
	}
	
	//methods
	public static void numberOfaccountsinfo() {
		String info = String.format("Number of accounts: %s", numberOfaccounts);
		System.out.println(info);
	}
	
	public static void ammountStoredinfo() {
		String info = String.format("Amount Stored: %s", amountStored);
		System.out.println(info);
	}

	
	public void AccountInfo() {
		String info = String.format("Checking Balance: %s, Savings Balance: %s", this.checkingBalance , this.savingsBalance);
		System.out.println(info);
	}
	
	public void checkingInfo() {
		String info = String.format("Checking Balance: %s", this.checkingBalance);
		System.out.println(info);
	}
	
	public void savingInfo() {
		String info = String.format("Savings Balance: %s", this.savingsBalance);
		System.out.println(info);
	}
	
	public void depositSavings(double savingsBalance) {
		
		this.savingsBalance += savingsBalance;
		
		amountStored += savingsBalance;
		
		String info = String.format("$%s deposited", savingsBalance);
		System.out.println(info);
		
	}
	
public void depositChecking(double checkingBalance) {
		
		this.checkingBalance += checkingBalance;
		
		amountStored += checkingBalance;
		
		String info = String.format("%s deposited", checkingBalance);
		System.out.println(info);
		
	}

public void withdrawSavings(double savingsBalance) {
	
	if(this.savingsBalance < savingsBalance) {
		 System.out.println("insufficient Savings funds");
	}else {
		amountStored -= savingsBalance;
		this.savingsBalance -= savingsBalance;
		String info = String.format("$%s withdrawn from savings account", savingsBalance);
		System.out.println(info);
		}
		
	}
	
	public void withdrawChecking(double checkingBalance) {
		
		if(this.checkingBalance < checkingBalance) {
			 System.out.println("insufficient Checking funds");
		}else {
			amountStored -= checkingBalance;
			this.checkingBalance -= checkingBalance;
			String info = String.format("$%s withdrawn from checking account", checkingBalance);
			System.out.println(info);
			
		}
		
	
}




}
