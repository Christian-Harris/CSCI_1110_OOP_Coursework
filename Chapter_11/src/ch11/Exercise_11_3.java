package ch11;

public class Exercise_11_3 {
	
	public static void main(String[] args) {
		
		Account myAccount = new Account(1, 100.0);
		CheckingAccount myCheckingAccount = new CheckingAccount(2, 200.0, 50.0);
		SavingsAccount mySavingsAccount = new SavingsAccount(3, 300.0);
	
		System.out.println("Account: " + myAccount.toString());
		System.out.println("Checking: " + myCheckingAccount.toString());
		System.out.println("Savings: " + mySavingsAccount.toString());
	}
}
