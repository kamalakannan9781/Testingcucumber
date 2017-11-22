package programs;

import java.util.Scanner;

public class factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,factorial=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("The value to find factorial");
		int value=scanner.nextInt();
		for(i=1;i<=value;i++)
		{
			factorial=factorial*i;
		}
        System.out.println("The factorial value is :"+factorial);
	}

}
