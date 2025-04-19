package ArrayOperation;

import java.util.Scanner;

public class DuplicateElement {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Define the array size
	        int arraySize = 5;
	        int[] a = new int[arraySize];

	        // Input elements into the array
	        System.out.println("Enter " + arraySize + " elements:");
	        for (int i = 0; i < arraySize; i++) {
	            a[i] = sc.nextInt();
	        }

	        // Close the scanner
	        sc.close();

	        // Count and display duplicate elements
	        System.out.println("Duplicate elements and their counts:");
	        for (int i = 0; i < arraySize; i++) {
	            int count = 1;
	            if (a[i] != -1) { // Skip already checked elements
	                for (int j = i + 1; j < arraySize; j++) {
	                    if (a[i] == a[j]) {
	                        count++;
	                        a[j] = -1; // Mark as checked
	                    }
	                }
	                if (count > 1) {
	                    System.out.println(a[i] + " occurs " + count + " times");
	                }
	            }
	        }
	    }
	}
