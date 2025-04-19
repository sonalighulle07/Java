package ArrayOperation;

	import java.util.Scanner;

	public class FrequencyApp {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size");
	        int size = sc.nextInt();
	        int a[] = new int[size];
	        System.out.println("Enter the array elements");
	        
	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }

	        // Loop through the array to count frequency of each element
	        for (int i = 0; i < a.length; i++) {
	            int count = 1; // Start with 1 because the element at index i is already counted
	            // Check if this element has already been counted
	            boolean isPrinted = false;

	            // Inner loop to check for duplicates of a[i]
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                    a[j] = -1; // Mark the element as counted
	                }
	            }

	            // Print the frequency of the element if it's not marked as counted (-1)
	            if (a[i] != -1) {
	                System.out.println(a[i] + "\t: " + count);
	            }
	        }
	    }
	}
