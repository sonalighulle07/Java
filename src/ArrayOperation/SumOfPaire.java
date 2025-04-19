package ArrayOperation;

import java.util.Scanner;

public class SumOfPaire {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the Array element");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("Pair found: (" + a[i] + ", " + a[j] + ")");
					
					
					flag=true;
				}
			}
			
		}
		if(!flag)
		{
			System.out.println("Pair is not found");
		}
		else
		{
			System.out.println("Pair is found");
		}
		}

}
