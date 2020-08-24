package ch10;

public class MyIntegerTest {
	public static void main(String[] args) {
		
		int num1 = 17;
		int num2 = 55;
		int num3 = 1102;
		
		MyInteger intOne = new MyInteger(num1);
		MyInteger intTwo = new MyInteger(num2);
		MyInteger intThree = new MyInteger(num3);
		
		System.out.println("Testing non static methods isEven(), isOdd(), isPrime().");
		
		System.out.println(intOne.getValue() + " is even?: " + intOne.isEven());
		System.out.println(intOne.getValue() + " is odd?: " + intOne.isOdd());
		System.out.println(intOne.getValue() + " is prime?: " + intOne.isPrime());
		
		System.out.println(intTwo.getValue() + " is even?: " + intTwo.isEven());
		System.out.println(intTwo.getValue() + " is odd?: " + intTwo.isOdd());
		System.out.println(intTwo.getValue() + " is prime?: " + intTwo.isPrime());
		
		System.out.println(intThree.getValue() + " is even?: " + intThree.isEven());
		System.out.println(intThree.getValue() + " is odd?: " + intThree.isOdd());
		System.out.println(intThree.getValue() + " is prime?: " + intThree.isPrime());
		
		System.out.println("Testing static methods isEven(int), isOdd(int), isPrime(int).");
		
		System.out.println(num1 + " is even?: " + MyInteger.isEven(num1));
		System.out.println(num1 + " is odd?: " + MyInteger.isOdd(num1));
		System.out.println(num1 + " is prime?: " + MyInteger.isPrime(num1));
		
		System.out.println(num2 + " is even?: " + MyInteger.isEven(num2));
		System.out.println(num2 + " is odd?: " + MyInteger.isOdd(num2));
		System.out.println(num2 + " is prime?: " + MyInteger.isPrime(num2));
		
		System.out.println(num3 + " is even?: " + MyInteger.isEven(num3));
		System.out.println(num3 + " is odd?: " + MyInteger.isOdd(num3));
		System.out.println(num3 + " is prime?: " + MyInteger.isPrime(num3));
		
		System.out.println("Testing static methods isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger).");
		
		System.out.println(intOne.getValue() + " is even?: " + MyInteger.isEven(intOne));
		System.out.println(intOne.getValue() + " is odd?: " + MyInteger.isOdd(intOne));
		System.out.println(intOne.getValue() + " is prime?: " + MyInteger.isPrime(intOne));
		
		System.out.println(intTwo.getValue() + " is even?: " + MyInteger.isEven(intTwo));
		System.out.println(intTwo.getValue() + " is odd?: " + MyInteger.isOdd(intTwo));
		System.out.println(intTwo.getValue() + " is prime?: " + MyInteger.isPrime(intTwo));
		
		System.out.println(intThree.getValue() + " is even?: " + MyInteger.isEven(intThree));
		System.out.println(intThree.getValue() + " is odd?: " + MyInteger.isOdd(intThree));
		System.out.println(intThree.getValue() + " is prime?: " + MyInteger.isPrime(intThree));
		
		System.out.println("Testing non static methods equals(int) and equals(MyInteger).");
		
		System.out.println(num1 + " = " + intOne.getValue() + "?: " + intOne.equals(num1));
		System.out.println(num2 + " = " + intOne.getValue() + "?: " + intOne.equals(num2));
		System.out.println(num3 + " = " + intOne.getValue() + "?: " + intOne.equals(num3));
		
		System.out.println(intOne.getValue() + " = " + intOne.getValue() + "?: " + intOne.equals(intOne));
		System.out.println(intTwo.getValue() + " = " + intOne.getValue() + "?: " + intOne.equals(intTwo));
		System.out.println(intThree.getValue() + " = " + intOne.getValue() + "?: " + intOne.equals(intThree));
		
		System.out.println("Testing parseInt(char[]).");
		
		char[] myArray = {'0', '0', '1', '2', '0','5','0','0','0'};
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
		}
		System.out.println(" = " + MyInteger.parseInt(myArray));
		
		System.out.println("Testing parseInt(String).");
		
		String s = "0123470";
		
		System.out.println(s + " = " + MyInteger.parseInt(s));
	}
}
