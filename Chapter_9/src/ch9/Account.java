package ch9;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return this.getBalance() * this.getMonthlyInterestRate() / 100;
	}
	
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}
}
