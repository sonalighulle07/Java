package ArrayOperation;

import java.util.Scanner;

public class EvenIndexNoElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
	    for(int i=0;i<a.length;i++)
	    {
	    	if(i%2==0)
	    	{
	    		System.out.println(a[i]);
	    	}
	    }
	}

}
