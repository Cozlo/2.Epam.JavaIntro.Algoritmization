// Даны действительные числа а1, а2, ...a2n. Найти max(a1+a2n, а2+a(2n-1), ..., аn+a(n+1)

package by.epam.algorithmisation.arrays.task7;

import java.util.Scanner;

public class Arrays7 {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Input n:");
		int n = scan.nextInt();
		System.out.println("Input " + 2*n + " elements of array");
		double [] arr = new double[2*n];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = scan.nextDouble();
		}System.out.println ("Получился массив:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.println (" " + arr[i]);
	    }
		double max;
		max = arr[1] + arr[2*n];
		for (int i=0; i < n; i++) {
			if ((arr[i] + arr[2*n-i+1]) > max) {
				max = arr[2*n-i+1];
			}
			
		}
		System.out.println("max= " + max);
	}
	}
//			writeln('vvedite n');
//			readln(n);
//			writeln('vvedite ',2*n,' elementov massiva');
//			for i:=1 to 2*n do read(a[i]);
//			max:=a[1]+a[2*n];
//			for i:=1 to n do
//			if a[i]+a[2*n-i+1]>max then max:=a[i]+a[2*n-i+1];
//			writeln('max=',max:0:6);
					
	