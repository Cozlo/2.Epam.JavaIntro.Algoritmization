// Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i.

package by.epam.algorithmisation.arrays.task5;

import java.util.Random;

public class Arrays5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rnd = new Random();
		for (int j = 0; j < arr.length; j++) {
			arr[j] = rnd.nextInt();
			System.out.println(arr[j]);
		}
		System.out.println("Numbers with ai > i: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i)
				System.out.println(arr[i]);

		}

	}
}
