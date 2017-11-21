package programs;

import java.util.Scanner;

public class sort {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,d,swap;
		Scanner in = new Scanner(System.in);
		System.out.println("input no of integer to sort");
		n=in.nextInt();
		int array[]=new int[n];
		System.out.println("Enter "+n+"integers");
		for(c=0;c<n;c++)	
			array[c]=in.nextInt();
		for(c=0;c<(n-1);c++)
		{
			for(d=0;d<n-c-1;d++)
			{
				System.out.println("array[d] value first +"+array[d]);
				if(array[d]>array[d+1])
				{
					System.out.println("array[d] value +"+array[d]);
					System.out.println("array[d+1] value +"+array[d+1]);
					swap=array[d];
					System.out.println("swap value "+swap);
					array[d]=array[d+1];
					System.out.println("array[d] value 1 +"+array[d]);
					array[d+1]=swap;
					System.out.println("array[d+1] value 1 +"+array[d+1]);
				}
			}
		}
		System.out.println("Sorted list of number");
		for(c=0;c<n;c++)
			System.out.println(array[c]);
		
}
}
