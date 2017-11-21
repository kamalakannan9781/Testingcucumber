package programs;

import java.util.Scanner;

public class sorting1 {
	
	public static void main(String[] args) {
		int c,d,swap;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number of value to sort");
	int n=scanner.nextInt();
	int[] array = new int[n];
	System.out.println("Enter the values");
	for(c=0;c<array.length;c++)
		array[c]=scanner.nextInt();
	for(c=0;c<array.length;c++)
	{
		for(d=0;d<array.length;d++)
		{
			if(array[c]<array[d])
			{
				swap=array[c];
				array[c]=array[d];
				array[d]=swap;
			}
		}
	}
	for(int k=0;k<array.length;k++)
	{
		System.out.println("the sorted value is :"+array[k]);
	}
	}
	

}
