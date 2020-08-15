package ch9;

public class Rectangle {
	private double width = 1;
	private double height = 1;
	
	Rectangle(){}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * this.width + 2 * this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
}
