package programs;

import java.util.Scanner;

public class revStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String value=scanner.next();
		for(int i=value.length()-1;i>=0;i--)
		{
			System.out.println("The reverse of string is :"+value.charAt(i));
		}

	}

}
