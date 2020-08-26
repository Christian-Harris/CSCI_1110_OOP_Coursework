package ch13;

public class Exercise_13_11 {

	public static void main(String[] args) {
		
		Octagon oct1 = new Octagon(4.5);
		Octagon oct2 = new Octagon();
		
		try {
			oct2 = (Octagon) oct1.clone();
		}catch(CloneNotSupportedException ex) {
			System.out.println("Unsuccessful clone of octagon.");
		}
		
		if(oct1.compareTo(oct2) == -1) {
			System.out.println("Octagon 1 has shorter side than octagon 2.");
		}
		else if(oct1.compareTo(oct2) == 0) {
			System.out.println("Octagon 1 has the same side length as octagon 2.");
		}
		else if(oct1.compareTo(oct2) == 1) {
			System.out.println("Octagon 1 has a longer side than octagon 2.");
		}
	}
}
