package ex_6_19;
import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first side length:");
		double s1 = Double.parseDouble(in.nextLine());
		System.out.print("Enter the second side length:");
		double s2 = Double.parseDouble(in.nextLine());
		System.out.print("Enter the third side length:");
		double s3 = Double.parseDouble(in.nextLine());
		
		if(isValid(s1, s2, s3)){
			System.out.println("Side 1: " + s1);
			System.out.println("Side 2: " + s2);
			System.out.println("Side 3: " + s3);
			System.out.printf("Area:  %4.1f", area(s1,s2,s3));
		}
		else {
			System.out.println("That is not a valid triangle.");
		}
		
		in.close();
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
