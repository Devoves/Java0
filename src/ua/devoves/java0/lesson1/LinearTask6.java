/*
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае: (рисунок в pdf с заданием)
 */

/*
 * Given a point with cordinates (x, y) write a programm that prints
 * true if the point belongs to the figure and
 * false if it does not. (see picture in the pdf file)
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class LinearTask6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		boolean belongs = false;

		// Quadrant 1
		if ((0 <= x && x <= 2) && (0 <= y && y <= 4)) {
			belongs = true;
		}

		// Quadrant 2
		else if ((-2 <= x && x <= 0) && (0 <= y && y <= 4)) {
			belongs = true;
		}

		// Quadrant 3
		else if ((-4 <= x && x <= 0) && (-3 <= y && y <= 0)) {
			belongs = true;
		}

		// Quadrant 4
		else if ((0 <= x && x <= 4) && (-3 <= y && y <= 0)) {
			belongs = true;
		} 
		
		//should exclude point x=0; y=-1
		if (x == 0 && y == -1) {
			belongs = false;
		}

		System.out.println(belongs);
	}
}