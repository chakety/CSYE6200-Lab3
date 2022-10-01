package edu.northeastern.csye6200;
import java.util.Scanner;

public class LAB3_P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.print("Eneter a credit card number as a long integer: ");
		long number = input.nextLong();
		if(isValid(number)) {
			System.out.println(number + " is valid.");
		}else {
			System.out.println(number + " is invalid.");
		}
		input.close();
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// TODO: write your code here
		if((getSize(number)>= 13 && getSize(number) <= 16)
			&&(prefixMatched(number,4)||prefixMatched(number,5)||prefixMatched(number,6)||prefixMatched(number,37))
			&&((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number)) % 10 == 0)){
				return true;
			}
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		// TODO: write your code here
		int sum = 0;
		String num = String.valueOf(number);
		for (int i = getSize(number)-2; i >= 0; i-= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		//System.out.println("sumOfDoubleEvenPlace is :" + sum);
		
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// TODO: write your code here
		if(number <= 9) {
			return number;
		}
		return  (number/ 10 + number % 10);
	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		// TODO: write your code here
		int sum = 0;
		String num = String.valueOf(number);
		for (int i = getSize(number)-1; i >= 0; i-= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + ""));
		}
		//System.out.println("sumOfOddPlace is :" + sum);
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// TODO: write your code here
		//System.out.println("AM I HERE? d is " + d);
		if(getPrefix(number,getSize(d)) == d) {
			//System.out.println("prefixMatched is :" + getPrefix(number,getSize(d)));
			return true;
		}
		return false;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		// TODO: write your code here
		int size = String.valueOf(d).length();
		//System.out.println("size is :" + num.length());
		return size;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		if(getSize(number) > k) {
			//System.out.println("getPrefix is :" + Long.parseLong(num.substring(0, k)));
			return Long.parseLong(String.valueOf(number).substring(0, k));
		}
		return number;
	}
}
