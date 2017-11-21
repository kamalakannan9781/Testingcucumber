package programs;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String value=scanner.next();
		System.out.println("kama");
		//char[] ch=value.toCharArray();		
		for(int i=value.length()-1;i>=0;i--)
		{
			System.out.println(value.charAt(i));
		}

	}

}
