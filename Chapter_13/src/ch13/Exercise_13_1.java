package ch13;

import java.util.Scanner;

public class Exercise_13_1 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		System.out.print("Please enter the three sides of your triangle: ");
		double s1 = Double.parseDouble(in.next());
		double s2 = Double.parseDouble(in.next());
		double s3 = Double.parseDouble(in.next());
		
		System.out.print("Please enter the color of your triangle: ");
		String col = in.next();
		
		System.out.print("Is your triangle filled? (1=y/0=n): ");
		int f = in.nextInt();
		
		Triangle tri = new Triangle(s1, s2, s3);
		tri.setColor(col);
		if(f == 1) {
			tri.setFilled(true);
		}
		else {
			tri.setFilled(false);
		}
		
		System.out.println(tri.toString());
		System.out.println("Area: " + tri.getArea());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Date Created " + tri.getDateCreated());
		System.out.println("Color : " + tri.getColor());
		if(tri.isFilled()) {
			System.out.println("Filled: " + true);
		}
		else {
			System.out.println("Filled: " + false);
		}
		
	}
}
