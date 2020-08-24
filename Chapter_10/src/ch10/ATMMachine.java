package ch10;

import java.util.Scanner;

public class ATMMachine {
	public static void main(String[] args) {
				
		ATMMachine myMachine = new ATMMachine();
		myMachine.start();
	}
	
	private static Account[] accounts = new Account[10];
	private static int id = -1;
	private static int selection = -1;
	
	ATMMachine() {
		for(int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
	}
	
	public void start() {
		while(true) {
			id = promptId();
			while(id != 1 && id != 2 && id != 3 && id != 4 && id != 5 && id != 6 && id != 7 && id != 8 && id != 9 && id != 0) {
				System.out.println("Invalid ID");
				id = ATMMachine.promptId();
			}
			while(selection != 4)
			{
				selection = ATMMachine.promptSelection();
				if(selection != 1 && selection != 2 && selection != 3 && selection != 4) {
					System.out.println("Invalid Selection");
					selection = promptSelection();
				}
				else {
					ATMMachine.processSelection(selection);
				}
			}
			id = -1;
			selection = -1;
		}
	}
	
	public static int promptId() {
		int selection;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an id (0 - 9): ");
		System.out.print(">");
		selection = in.nextInt();
		//in.close();
		return selection;
	}
	
	public static int promptSelection() {
		int selection;
		Scanner in = new Scanner(System.in);
		System.out.println("Main menu:");
		System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
		System.out.print(">");
		selection = in.nextInt();
		return selection;
	}
	
	public static void processSelection(int selection) {
		if(id == -1) {
			System.out.println("No ID Selected.");
		}
		else {
			if(selection == 1) {
				System.out.printf("The balance is: %10.2f\n", accounts[id].getBalance());
			}
			else if(selection == 2) {
				System.out.println("Enter an amount to withdraw: ");
				accounts[id].withdraw(new Scanner(System.in).nextDouble());
			}
			else if(selection == 3) {
				System.out.println("Enter an amount to deposit: ");
				accounts[id].deposit(new Scanner(System.in).nextDouble());
			}
			else if(selection == 4) {}
		}
	}
}
