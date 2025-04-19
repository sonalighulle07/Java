package ArrayOperation;
import java.util.*;

public class MajortyElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int a[]=new int[5];
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
			if(count>(a.length/2))
			{
				System.out.println("majority element:"+a[i]);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("no majority element");
		}
		

	}

}
