/*
 * Найти max{min(a, b), min(c, d)}.
 */

/*
 * Find max{min(a, b), min(c, d)}.
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class BranchingTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		scan.close();

		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
	}

}