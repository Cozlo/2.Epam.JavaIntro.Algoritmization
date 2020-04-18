/** Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем 
 * отрицательных, положительных и нулевых элементов.
 */

package by.epam.algorithmisation.arrays.task3;

import java.util.Scanner;

public class Arrays3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размерность массива N: ");
		int n = scanner.nextInt();
		double [] a = new double [n];
		System.out.println("Введите N действительных элементов массива: ");
		for (int i = 0; i < n; i++) {
		a[i] = scanner.nextDouble();
	} 
		System.out.println ("Получился массив:");
	    for (int i = 0; i < n; i++) {
	        System.out.println (" " + a[i]);
	}
	    int plus = 0;
	    int minus = 0;
	    int zero = 0;
	    for (int j = 0; j<n; j++) {
	    	if (a[j] < 0)
	    		minus++;
	    	if (a[j] > 0)
	    		plus++;
	    	if (a[j] == 0)
	    		zero++;
	    }
	    System.out.println ("Отрицательных: "+ minus + " Положительных: "+ plus + " Нулей: "+ zero);
	}
}
