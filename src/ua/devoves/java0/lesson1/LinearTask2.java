/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): (рисунок в pdf с заданием)
 */

/*
 * Calculate the value of an expression using the formula (all variables take real values): (see picture in the pdf file)
 */

package ua.devoves.java0.lesson1;

public class LinearTask2 {

	public static void main(String args[]) {
		double a = 2;
		double b = 3;
		double c = 3.5;

		double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
		System.out.println(z);
	}
}