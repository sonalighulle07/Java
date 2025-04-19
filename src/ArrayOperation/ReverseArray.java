package ArrayOperation;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the element in Array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Before reverse Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
			
		}
		
		System.out.println("After Reverse Array");
		for(int i=size-1;i>=0;i--)
		{
			System.out.printf("%d\t",a[i]);
		}

	}

}
