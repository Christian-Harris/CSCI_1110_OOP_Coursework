package ch13;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

private double side = 1.0;
	
	public Octagon() {}
	
	public Octagon(double s) {
		this.side = s;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double s) {
		this.side = s;
	}
	
	public double getArea() {
		double area = (2 + (4/Math.pow(2, 0.5))) * Math.pow(this.getSide(), 2);
		return area;
	}
	
	public double getPerimeter() {
		return this.getSide() * 8;
	}
	
	public int compareTo(Octagon obj) {
		double lhs = this.getSide();
		double rhs = obj.getSide();
		if(lhs < rhs) {
			return -1;
		}
		else if(lhs == rhs) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String toString() {
		String s = "Octagon: side = " + this.getSide();
		return s;
	}
}
