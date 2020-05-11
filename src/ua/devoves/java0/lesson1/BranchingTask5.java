/*
 * Вычислить значение функции: (рисунок в pdf с заданием)
 */

/*
 * Calculate function value: (see picture in the pdf file)
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class BranchingTask5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		scan.close();
		double y;

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("When x = " + x + ", F(x) = " + y);
	}
}
