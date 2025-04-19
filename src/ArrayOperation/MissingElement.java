package ArrayOperation;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the arrray Element");
		int a[]=new int[size];
		int value=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			
		{  int k=a[i]+1;
			if(a[i+1]==k)
					{
				      continue;
					}
			else
			{
				value=k;
				break;
			}
		}
		
		
	

}
		System.out.println("missing elemnet is="+value);
	}
}

