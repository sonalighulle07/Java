package ArrayOperation;
import java.util.*;

public class SimpleArrayDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
