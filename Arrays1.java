// В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.

package by.epam.algorithmisation.arrays.task1;

public class Arrays1 {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 4, 6, 3, 24, 100, 44, 25 };
		int k = 2;
		int sum = 0;
		for (int x = 0; x < a.length; x++) {
			if (a[x] % k == 0) {
				sum = sum + a[x];

			}

		}
		System.out.println(sum);
	}
}
