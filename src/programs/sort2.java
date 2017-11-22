package programs;

import java.util.Scanner;

public class sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, d, swap;
        Scanner in = new Scanner(System.in);
        System.out.println("Input no of integer to sort");
        n=in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter"+n+"integer");
        for(c=0;c<n;c++)
        	array[c]=in.nextInt();
        for(c=0;c<(n-1);c++)
        {
        	for(d=0;d<n-c-1;d++)
        	{
        		if(array[d]>array[d+1])
        		{
        			swap=array[d];
        			array[d]=array[d+1];
        			array[d+1]=swap;
        			
        		}
        	}
        }
        System.out.println("Sorted list of number");
        for(c=0;c<n;c++)
        System.out.println("The sorted value is :"+array[c]);
	}

}
