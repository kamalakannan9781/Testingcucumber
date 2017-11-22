package programs;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];
		System.out.println("Enter matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println("The above matrix before transpose is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.println(array[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
