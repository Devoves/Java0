/*
 * Вычислить значения функции на отрезке [а, b] c шагом h: (рисунок в pdf с заданием)
 */

/*
 * Calculate function value on the segment [a, b] with step h: (see picture in the pdf file)
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class CyclesTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		scan.close();
		double y;
		double x;

//		Number of steps including "a"
		int numberOfSteps = (int) ((b - a) / h + 1);
		System.out.println("# of steps: " + numberOfSteps);

		for (int i = 0; i < numberOfSteps; i++) {
			x = a + (h * i);
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("\"y\" is: " + y);
		}

		/*
		 * If (b-a)/h gives us not a whole number, we calculate the function with a "b"
		 * argument explicitly. Otherwise the "b" will be excluded.
		 */
		if ((b - a) / h > numberOfSteps - 1) {
			x = b;
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("Last \"y\" is: " + y);
		}
	}
}
