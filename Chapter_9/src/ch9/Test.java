package ch9;

public class Test {
	public static void main(String[] args) {
		Rectangle FirstRectangle = new Rectangle(4.0,40.0);
		Rectangle SecondRectangle = new Rectangle(3.5, 35.9);
		
		System.out.print("Rectangle One\nWidth: " + FirstRectangle.getWidth() + "\nHeight: " + FirstRectangle.getHeight() + "\nArea: " + FirstRectangle.getArea() + "\nPerimeter: " + FirstRectangle.getPerimeter());
		System.out.print("\n\n");
		System.out.print("Rectangle Two\nWidth: " + SecondRectangle.getWidth() + "\nHeight: " + SecondRectangle.getHeight() + "\nArea: " + SecondRectangle.getArea() + "\nPerimeter: " + SecondRectangle.getPerimeter());
	}
}
