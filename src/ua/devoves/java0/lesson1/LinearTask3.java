/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): (рисунок в pdf с заданием)
 */

/*
 * Calculate the value of an expression using the formula (all variables take real values): (see picture in the pdf file)
 */

package ua.devoves.java0.lesson1;

import java.lang.Math;

public class LinearTask3 {

	public static void main(String args[]) {
		double xDeg = 30.0; // degrees
		double yDeg = 45.0; // degrees
		double x = Math.toRadians(xDeg);
		double y = Math.toRadians(yDeg);

		double z = (Math.sin(x) + Math.cos(y)) / Math.cos(x) - Math.cos(y) * Math.tan(x * y);

		System.out.println(z);
	}
}