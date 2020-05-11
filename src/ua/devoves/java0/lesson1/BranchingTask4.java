/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

/*
 * Given rectangular hole with sides А, В and a brick with sides x, y, z.
 * Find out whether the brick will go through the hole.
 * 
 * p.s. Please, don't try to destroy the universe by fitting the bricks
 * with negative length sides :)
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class BranchingTask4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		scan.close();
		
		double maxBrickSide = Math.max(Math.max(x, y), z);
		double minBrickSide = Math.min(Math.min(x, y), z);
		double middleBrickSide = x + y + z - maxBrickSide - minBrickSide;

		double maxHoleSide = Math.max(A, B);
		double minHoleSide = Math.min(A, B);

		if (minBrickSide <= minHoleSide) {
			if (middleBrickSide <= maxHoleSide) {
				System.out.println("The brick will go through!");
			}
		} else {
			System.out.println("The brick won't fit in the hole :(");
		}
	}
}
