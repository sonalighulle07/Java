package ArrayOperation;
import java.util.*;

public class AnagramArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of An Array");
		int size = sc.nextInt();

		int[] a = new int[size];
		int[] b = new int[size];

		System.out.println("Enter the Array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the second Array");
		for (int i = 0; i < size; i++) {
			b[i] = sc.nextInt();
		}

		// Sort array a
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// Sort array b
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}

		// Compare sorted arrays
		boolean flag = true;
		for (int i = 0; i < size; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Arrays are anagram");
		} else {
			System.out.println("Arrays are not anagram");
		}
	}
}
