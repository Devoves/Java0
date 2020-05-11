/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

/*
 * Given two angles of a triange, find out if such a triangle exist.
 * If yes, find out whether it is a right-angled triangle.
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class BranchingTask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Angle1 = scan.nextInt();
		int Angle2 = scan.nextInt();
		scan.close();

		if (Angle1 + Angle2 < 180) {
			System.out.println("Such a triangle exist.");
			if (Angle1 + Angle2 == 180 - 90) {
				System.out.println("It is a right-angled triangle.");
			}
		} else {
			System.out.println("Its not a triangle!");
		}

	}

}
