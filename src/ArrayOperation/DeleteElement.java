package ArrayOperation;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the index");
		int index=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			else
			{
				System.out.printf("%d\t",a[i]);
			}
		}
		}

}
