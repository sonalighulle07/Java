package ArrayOperation;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean flag=false;
		
		
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elemenet for search");
		int element=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(a[i]==element)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}

	}

}
