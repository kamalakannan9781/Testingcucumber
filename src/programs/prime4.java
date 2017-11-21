package programs;

import java.util.Scanner;

public class prime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m = 0, flag = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scanner.nextInt();
		m = n / 2;
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("the number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The number is prime");
		}

	}

}
