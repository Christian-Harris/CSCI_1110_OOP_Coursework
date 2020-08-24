/*
 * Christian Harris
 * 24 August 2020
 */

package ch12;

import java.util.Scanner;
import java.lang.Math;

public class ArrayIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int selection;
		
		int[] myArray = new int[100];
		
		for(int i = 0; i < 100; i++) {
			myArray[i] = (int)(Math.random()*1000);
		}
		
		System.out.print("Please enter an index (0 to 99): ");
		selection = in.nextInt();
		
		try {
			System.out.println("myArray[" + selection +"] = " + myArray[selection]);
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
		
		in.close();
	}
}
