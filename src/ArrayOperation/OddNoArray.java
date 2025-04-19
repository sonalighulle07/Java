package ArrayOperation;
import java.util.*;

public class OddNoArray {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
					System.out.println("nter the array");
			int a[]=new int[5];
			for(int i=0;i<a.length;i++)
				{
				a[i]=sc.nextInt();
				}
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%5==1)
				{
					System.out.println(a[i]);
				}
				else
				{
					continue;
				}
			}

		}

	}
