/*
 * ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
 */

/*
 * Given three dots �(�1,�1), �(�2,�2) � �(�3,�3), find out if they are situated on the same line.
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class BranchingTask3 {

	public static void main(String[] args) {

		// Enter x1, y1, x2, y2, x3, y3
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();
		scan.close();

		double angleX2ToX1 = (x2 - x1) / (y2 - y1);
		double angleX3ToX2 = (x3 - x2) / (y3 - y2);

		if (angleX2ToX1 == angleX3ToX2) {
			System.out.println("Dots \nA (" + x1 + ", " + y1 + "), " + "\nB (" + x2 + ", " + y2 + "), " + "\nC (" + x3 + ", "
					+ y3 + "), \nare on the same line.");
		} else {
			System.out.println("Dots \nA (" + x1 + ", " + y1 + "), " + "\nB (" + x2 + ", " + y2 + "), " + "\nC (" + x3 + ", "
					+ y3 + "), \ndon't form a line.");
		}

	}

}
