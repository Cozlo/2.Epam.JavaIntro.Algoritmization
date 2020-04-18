// Даны действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший элементы

package by.epam.algorithmisation.arrays.task4;

import java.util.Scanner;

public class Arrays4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input array length n: ");
		int n = scan.nextInt();
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = Math.random() * n;
			System.out.println(array[i]);
		}
		int max = 0;
		int min = 0;
		for (int j = 0; j < n; j++) {
			if (array[j] > array[max]) {
				max = j;
			}
			if (array[j] < array[min]) {
				min = j;
			}

		}
		double tmp = array[max];
		array[max] = array[min];
		array[min] = tmp;
		System.out.println("New array is:");
		for (int j = 0; j < n; j++) {
			System.out.println(array[j]);
		}

	}
}
