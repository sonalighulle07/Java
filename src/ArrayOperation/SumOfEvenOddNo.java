package ArrayOperation;

import java.util.Scanner;

public class SumOfEvenOddNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of An Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in Array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum1=0,sum2=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				sum1=sum1+a[i];
			}
			else
			{
				sum2+=a[i];
			}
		}
		System.out.println("sum of Even Number= "+sum1);
		System.out.println("um of Add Number is ="+sum2);
	}

}
