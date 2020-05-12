/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

/*
 * A real number R of the form nnn.ddd (three digital digits in fractional and integer parts) is given.
 * Swap the fractional and integer parts of the number and print the resulting value of the number.
 */

package ua.devoves.java0.lesson1;

public class LinearTask4 {

	public static void main(String args[]) {
		String input = "123.321";

		String fractionNumberStr = input.substring(4);
		String wholeNumberStr = input.substring(0, 3);

		double newDouble = Double.parseDouble(fractionNumberStr + "." + wholeNumberStr);
		System.out.println(newDouble);
	}
}