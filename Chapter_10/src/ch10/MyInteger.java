package ch10;

import java.math.*;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		if(this.getValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if(this.getValue() % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isPrime() {
		BigInteger bigInt = BigInteger.valueOf(this.getValue());
		return bigInt.isProbablePrime(100);
	}
	
	public static boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int number) {
		if(number % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isPrime(int number) {
		BigInteger bigInt = BigInteger.valueOf(number);
		return bigInt.isProbablePrime(100);
	}
	
	public static boolean isEven(MyInteger number) {
		return number.isEven();
	}
	
	public static boolean isOdd(MyInteger number) {
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number) {
		return number.isPrime();
	}
	
	public boolean equals(int number) {
		if(this.getValue() == number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger number) {
		if(this.getValue() == number.getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int parseInt(char[] number) {
		int indexOfFirstNonZero = -1;
		for(int i = 0; i < number.length; i++) {
			if(number[i] != '0') {
				indexOfFirstNonZero = i;
				break;
			}
			else {
				continue;
			}
		}
		if(indexOfFirstNonZero == -1) {
			return 0;
		}
		else {
			int result = 0;
			for(int i = number.length; i > indexOfFirstNonZero; i--) {
				result = result + (Character.getNumericValue(number[i-1]) * (int)Math.pow(10,  number.length - i));
			}
			return result;
		}
	}
	
	public static int parseInt(String number) {
		char[] num = number.toCharArray();
		return MyInteger.parseInt(num);
	}
}
