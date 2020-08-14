package ex_6_20;

import java.util.Scanner;

public class NumberOfLetters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input = in.nextLine();
		System.out.println(input + " is " + input.length() + "characters lont");
		System.out.println("There are " + countLetters(input) + " letters in " + input);
		in.close();
	}
	
	public static int countLetters(String s) {
		int numOfLetters = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i)))
			{
				numOfLetters++;
			}
			else{
				continue;
			}
		}
		return numOfLetters;
	}
}
