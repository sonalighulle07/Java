package ArrayOperation;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter any index for rotating array");
		int index=sc.nextInt();
		
		for(int i=index;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		for(int i=0;i<index;i++)
		{
			System.out.printf("%d\t",a[i]);
		}

	}

}
