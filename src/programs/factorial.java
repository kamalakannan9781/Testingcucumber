package programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		Scanner scanner= new Scanner(System.in);
		int number =scanner.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of"+number+"is :"+fact);
		
	}

}
