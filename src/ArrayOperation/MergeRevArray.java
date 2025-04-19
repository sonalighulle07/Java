package ArrayOperation;

import java.util.Scanner;

public class MergeRevArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the  first Array");
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second Array");
		int b[]=new int[size];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int result[]=new int[a.length+b.length];
		int c=0;
		
		for(int i=b.length-1;i>=0;i--)
		{
			result[c]=b[i];
			c++;
		}
		for(int i=0;i<a.length;i++)
		{
			result[c]=a[i];
			c++;
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.printf("%d\t",result[i]); 
		}
	

	}

}
