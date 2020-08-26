package ch13;

public class Triangle extends GeometricObject implements Colorable{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	public double getArea() {
		double s = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
		double area = Math.pow(s * (s - this.getSide1()) * (s - this.getSide2()) * (s - this.getSide3()), 0.5);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = this.getSide1() + this.getSide2() + this.getSide3();
		return perimeter;
	}
	
	public String toString() {
		return "Triangle: side1 = " + this.getSide1() + " side2 = " + this.getSide2() + " side3 = " + this.getSide3();
	}
	
	public void howToColor() {
		System.out.println("Color all three sides.");
	}
}
