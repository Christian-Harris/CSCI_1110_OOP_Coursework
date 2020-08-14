package ex_6_9;

public class UnitConversions{
	
	public static void main(String[] args) {
		System.out.println("Feet\tMeters\t\tMeters\tFeet");
		System.out.println("---------------------------------");
		for(int i = 1; i <= 10; i++) {
			double feet = i;
			double meters = 15 + (i * 5);
			System.out.printf("%3.1f\t%5.3f\t\t%3.1f\t%5.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
		}
	}
	
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}