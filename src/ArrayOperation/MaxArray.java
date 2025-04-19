package ArrayOperation;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				temp=max;
				max=a[i];
				a[i]=temp;
			}
		}
		System.out.println("Max number in Array is = "+max);
	}
}

			
				
	