/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

/*
 * Make a program to find the product of the squares of the first two hundred numbers.
 * Assumption: whole numbers [1 - 200]
 */

package ua.devoves.java0.lesson1;

import java.math.BigInteger;

public class CyclesTask4 {

	public static void main(String[] args) {
		BigInteger sumBig = BigInteger.ONE;
		for (int i = 2; i <= 200; i++) {
			sumBig = sumBig.multiply(BigInteger.valueOf(i)); // factorial
		}

		sumBig = sumBig.pow(2);
		System.out.println(sumBig);
	}

}