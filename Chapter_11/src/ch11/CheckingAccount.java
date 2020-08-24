package ch11;

import java.lang.Math;

public class CheckingAccount extends Account{

	private double overdraftLimit = 0;
	
	public String toString() {
	
		//String s = "ID: " + this.getId() + "\nBalance: " + this.getBalance() + "\nRate: " + this.getAnnualInterestRate() + "\nDate Created: " + this.getDateCreated() + "\nOverdraft Limit: " + this.getOverdraftLimit();
		//return s;
		return super.toString() + "\nOverdraft Limit: " + this.getOverdraftLimit();
	}
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		if(Math.abs(this.getBalance() - amount) > this.getOverdraftLimit()) {
			System.out.println("Cannot exteed overdraft limit of: " + this.getOverdraftLimit());
		}
		else {
			this.setBalance(this.getBalance()-amount);
		}
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}
}
