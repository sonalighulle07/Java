package ArrayOperation;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elemnet in array is =:"+sum);
	}
	

}
