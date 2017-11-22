package programs;

import java.util.Scanner;

public class fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int fibocount = scanner.nextInt();
		int[] fibo = new int[fibocount];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println();

		for (int i = 2; i < fibocount; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		for (int i = 0; i < fibocount; i++) {
			System.out.println("The fibo value is :" + fibo[i]);
		}
	}

}
