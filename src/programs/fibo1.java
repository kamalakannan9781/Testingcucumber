package programs;

import java.util.Scanner;

public class fibo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int fibocount=scanner.nextInt();
		int[] fib = new int[fibocount];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fibocount;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];			
		}
        for(int i=0;i<fibocount;i++)
        {
        	System.out.println("The fibnocci value is :"+fib[i]);
        }
	}

}
