package ch13;

import java.util.Date;

public abstract class GeometricObject {
	
	private String color = "";
	private boolean filled = false;
	private Date dateCreated = new Date();
	
	public GeometricObject() {}
	
	public GeometricObject(String c, boolean f) {
		color = c;
		filled = f;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean f) {
		this.filled = f;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
