// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами

package by.epam.algorithmisation.arrays.task6;

public class Arrays6 {
	public static void main(String[] args) {

		double[] n = new double[5];
		double sum = 0;
		System.out.println("given sequence is:");
		for (int i = 0; i < 5; i++) {
			n[i] = Math.random() * 5;
			System.out.println(n[i]);
		}
		for (int i = 0; i < 5; i++) {	
		if ((i + 1) > 1) {
				int num = 1;
				for (int j = 2; j <= (i + 1); j++) {
					if ((i + 1) % j == 0) {
						num++;
					}

				}
				if (num == 2) {
					sum += n[i];
				}
			}
		}
		System.out.println("Sum of numbers: " + sum);
	}

}
