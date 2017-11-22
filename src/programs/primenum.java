package programs;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0;
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		m=n/2;
		System.out.println("m value :"+m);
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("the number is not prime");
				flag=1;	
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("the number is prime");
		}

	}

}
