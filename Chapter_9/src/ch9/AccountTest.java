package ch9;

import java.text.*;

public class AccountTest {
	public static void main(String[] args) {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
				
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		
		System.out.printf("Balance:\t\t%8.2f\nMonthlyInterest:\t%4.2f\nDate Created:\t\t%s\n", myAccount.getBalance(), myAccount.getMonthlyInterest(), df.format(myAccount.getDateCreated()));
	}
}
