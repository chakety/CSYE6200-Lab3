package edu.northeastern.csye6200;
import java.util.Scanner;
public class LAB3_P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter the number of values: ");
		Scanner input = new Scanner(System.in);
		int inputVal = input.nextInt();
		int[]vals = new int[inputVal];
		System.out.print("Enter the number: ");
		for(int i= 0; i<inputVal; i++) {
			vals[i] = input.nextInt();
		}
		if(isConsecutiveFour(vals)) {
			System.out.println("The list has consecutive fours ");
		}else {
			System.out.println("The list has no consecutive fours ");
		}
		input.close();
	}

	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		int count = 1;
		int size = values.length;
		int i = 0;
		while(i < size -1) {
			for(int j = 1; j <size; j++) {
				if(values[i] == values[j]) {
					count++;
					if(count == 4) {
						return true;
					}
				}else {
					count = 1;
				}
				i++;
			}
		}
		
		return false;
	}

}

