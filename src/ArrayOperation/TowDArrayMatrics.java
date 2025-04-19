package ArrayOperation;

import java.util.Scanner;

public class TowDArrayMatrics {

	public static void main(String[] args) {
		{
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int a[][]=new int[size][size];
			System.out.println("Enter values in matrix");
			for(int i=0; i<a.length; i++)
			{
			    for(int j=0; j<a[i].length; j++)
				{
				   a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Display matrix");
			for(int i=0;i<a.length;i++)
			{
			    for(int j=0;j<a[i].length; j++)
				{ System.out.printf("%d\t",a[i][j]);
				}
				System.out.printf("\n");
			}
		}
	}
}

