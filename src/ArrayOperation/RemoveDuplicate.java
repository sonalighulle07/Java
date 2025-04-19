package ArrayOperation;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean flag=false;
		int value=0;
		System.out.println("Enter the element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count;
		for(int i=0;i<a.length;i++)
		{    
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				value=a[i];
				flag=true;
				break;
				
				}
			
		}
			
	}
		if(flag)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==value)
				{
					continue;
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
