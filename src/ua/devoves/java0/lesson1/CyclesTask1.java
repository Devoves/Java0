/*
 * �������� ���������, ��� ������������ ������ ����� ����� ������������� �����,
 * � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
 */

/*
 * Write a program where you enter any positive whole number and the program
 * sums up all the whole numbers starting from 1 to the entered number.
 */

package ua.devoves.java0.lesson1;

import java.util.Scanner;

public class CyclesTask1 {

	public static void main(String[] args) {

		System.out.println("������� ����� ����� ������������� �����:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while (input <= 0) {
			System.out.println("������� ����� ����� ������������� �����:");
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
