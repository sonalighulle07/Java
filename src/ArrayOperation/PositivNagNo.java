package ArrayOperation;

import java.util.Scanner;

public class PositivNagNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of An array");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the Array Element");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("positive number");
		for(int i=0;i<s;i++)
		{
			if(a[i]>0)
			{
				
				System.out.printf("%d\t",a[i]);
			}
		}
		System.out.println();
		System.out.println("Nagative number");
		for(int i=0;i<s;i++)
		{
			if(a[i]<0)
			{
				
				System.out.printf("%d\t",a[i]);
			}
		}
	}

}
