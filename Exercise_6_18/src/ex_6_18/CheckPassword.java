/*Christian Harris
 * 14 August 2020
 */

package ex_6_18;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String input = in.nextLine();
		if(isValid(input)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		in.close();
	}

	public static boolean isValid(String s) {
		if(s.length() < 8) {
			return false;
		}
		else {
			int digitCount = 0;
			for(int i = 0; i < s.length(); i++) {
				if(!(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))){
					return false;
				}
				else if(Character.isDigit(s.charAt(i))) {
					digitCount++;
				}
			}
			if(digitCount < 2) {
				return false;
			}
			else {
				return true;
			}
		}
	}
}
