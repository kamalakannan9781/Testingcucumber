package programs;

import java.util.Scanner;

public class RevN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("kamal");
		int n,reverse=0;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		while(n!=0)
		{
			reverse= reverse*10;
			reverse=reverse+n%10;
			n=n/10;
					
		}
		System.out.println("The reverse of the number is :"+reverse);
		
		
	}	 

}
