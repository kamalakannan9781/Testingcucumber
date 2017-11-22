package programs;

import java.util.Scanner;

public class fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,fact=1;
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("The factorial value of"+n+"is :"+fact);
	}

}
