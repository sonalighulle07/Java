package ArrayOperation;
import java.util.*;

public class MinumumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the array");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]<min)
			{
				int temp=min;
				min=a[i];
				a[i]=temp;
			}
		}
		System.out.println("Minimum number in Array is= "+min);
		
	}

}
