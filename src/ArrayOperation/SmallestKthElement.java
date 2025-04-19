package ArrayOperation;
import java.util.*;
import java.util.Arrays;

public class SmallestKthElement {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array
	        System.out.println("Enter size of the array:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Input k
	        System.out.println("Enter the value of k:");
	        int k = sc.nextInt();

	        if (k <= 0 || k > n) {
	            System.out.println("Invalid value of k.");
	        } else {
	            // Sort the array
	            Arrays.sort(arr);
	            // Kth smallest is at index k-1
	            System.out.println("Kth smallest element is: " + arr[k - 1]);
	        }

	        sc.close();
	    }
	}
