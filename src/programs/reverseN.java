package programs;

import java.util.Scanner;

public class reverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse=0;
		System.out.println("Enter the number to reverse");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();	
		
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse of the entered number is "+reverse);

	}

}
