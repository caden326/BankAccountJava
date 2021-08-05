
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructors
		BankAccount bankaccount1 = new BankAccount();
		BankAccount bankaccount2 = new BankAccount();
		BankAccount bankaccount3 = new BankAccount();
		
		
		
		//methods
		
		
//		bankaccount1.AccountInfo();
//		bankaccount1.checkingInfo();
//		bankaccount1.savingInfo();
		
		
		bankaccount1.depositSavings(10.50);
		bankaccount1.withdrawSavings(11.50);
		
		bankaccount1.depositChecking(100.30);
		bankaccount1.withdrawChecking(50.01);
		bankaccount1.withdrawChecking(60);
		bankaccount1.AccountInfo();
		
		BankAccount.ammountStoredinfo();
		
		BankAccount.numberOfaccountsinfo();
		
	}

}
