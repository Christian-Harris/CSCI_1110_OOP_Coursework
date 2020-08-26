package ch13;

public class Exercise_13_7 {
	
	public static void main(String[] args) {
		GeometricObject[] list = new GeometricObject[5];
		
		list[0] = new Triangle(5, 5, 5);
		list[1] = new Triangle(1, 2, 3);
		list[2] = new Triangle(3, 4, 5);
		list[3] = new Triangle(5, 12, 13);
		list[4] = new Triangle(30, 40, 50);
		
		Triangle myTriangle;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Object number " + i + "\nArea = " + list[i].getArea());
			myTriangle = (Triangle) list[i];
			myTriangle.howToColor();
		}
	}
}
