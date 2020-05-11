/*
 * Ќапишите программу, где пользователь вводит любое целое положительное число,
 * а программа суммирует все числа от 1 до введенного пользователем числа.
 */

/*
 * Write a program where you enter any positive whole number and the program
 * sums up all the whole numbers starting from 1 to the entered number.
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class CyclesTask1 {

	public static void main(String[] args) {

		System.out.println("¬ведите любое целое положительное число:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while (input <= 0) {
			System.out.println("¬ведите любое целое ѕќЋќ∆»“≈Ћ№Ќќ≈ число:");
			input = scan.nextInt();
			// input = scan.nextInt();
		}
		scan.close();

		int sum = 0;
		for (int i = 1; i < input; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
