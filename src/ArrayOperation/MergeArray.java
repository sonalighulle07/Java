package ArrayOperation;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array element in first Array");
		
		int b[]=new int[size];
		System.out.println("Enter the Array element in Second Array");
		
		int result[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for(int i=0;i<b.length;i++)
	    {
	    	b[i]=sc.nextInt();
	    }
	    int c=0;
	    for(int i=0;i<a.length;i++,c++)
	    {
	    	result[c]=a[i];
	    }
	    for(int i=0;i<b.length;i++,c++)
	    {
	    	result[c]=b[i];
	    }
	    System.out.println("After merging");
	    
	    for(int i=0;i<result.length;i++)
	    {
	    	System.out.printf("%d\t",result[i]);
	    }

	}

}
