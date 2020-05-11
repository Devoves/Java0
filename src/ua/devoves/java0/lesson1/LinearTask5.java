/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

/*
 * Given T, a number that represents past time in seconds, 
 * print it in the form: HHh MMm SSs.
*/

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class LinearTask5 {

	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.close();

		hours = T / 3600; // number of hours
		minutes = (T % 3600) / 60; // number of minutes, excl. hours
		seconds = ((T % 3600) % 60); // number of seconds, excl. hours and minutes

		System.out.println(hours + "ч " + minutes + "мин " + seconds + "с.");
	}
}