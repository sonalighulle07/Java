package ArrayOperation;

import java.util.Scanner;

public class PrimeNoInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int a[]=new int[size];
		int count;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{  
			count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					System.out.println(a[i]);
				}
			
		}
	}

}
