/*
 * Найти сумму квадратов первых ста чисел.
 */

/*
 * Find the sum of the squares of the first hundred numbers.
 * Assumption: whole numbers [1 - 100]
 */

package ua.devoves.java0.lesson1;

public class CyclesTask3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int x = (int) Math.pow(i, 2);
			sum += x;
		}
		System.out.println(sum);
	}
}