package programs;

import java.util.Scanner;

public class finot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		int fibocount=scanner.nextInt();
		int[] fib = new int[fibocount];
		fib[0]=0;
		fib[1]=1;
		for(i=2;i<fibocount;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			
		}
		for(i=0;i<fibocount;i++)
		{
			System.out.println("the fibonacci value is :"+fib[i]);
		}

	}

}
