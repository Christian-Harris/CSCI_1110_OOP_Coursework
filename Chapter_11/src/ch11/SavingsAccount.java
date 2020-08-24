package ch11;

public class SavingsAccount extends Account{

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if(this.getBalance() - amount < 0.0) {
			System.out.println("Insufficient Funds.");
		}
		else {
			this.setBalance(this.getBalance() - amount);
		}
	}
}
