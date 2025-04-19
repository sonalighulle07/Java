package ArrayOperation;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the Array Elelement");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			b[c]=a[i];
			c++;
		}
		System.out.println("After coping Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		

	}

}
