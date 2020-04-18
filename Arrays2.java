/** Дана последовательность действительных чисел а1, а2, ... аn. Заменить все ее члены, большие данного Z
 * этим числом. Подсчитать количество замен 
 */

package by.epam.algorithmisation.arrays.task2;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input array length n: ");
		int n = scanner.nextInt();
		int sum = 0;
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = Math.random() * n;
			System.out.println(a[i]);
		}
		System.out.print("Input Z: ");
		double z = scanner.nextDouble();
		for (int x = 0; x < n; x++) {
			if (a[x] > z) {
				a[x] = z;
				sum++;
			}
			System.out.println(a[x]);
		}

		System.out.println("Number of changing: " + sum);
	}
}
