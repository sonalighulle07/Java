package ArrayOperation;
import java.util.*;

public class InsertionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the first array
        
        System.out.println("Enter the first array (4 elements):");
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        // Read the second array
        
        System.out.println("Enter the second array (2 elements):");
        int b[] = new int[2];
        for (int j = 0; j < b.length; j++) {
            b[j] = sc.nextInt();
        }
        
        // Find and print common elements
        
        System.out.println("Common elements between the two arrays:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                // If elements are equal and not already printed
            	
            	
                if (a[i] == b[j]) {
                    System.out.printf("%d\t",a[i]);
                    b[j] = -1; 
                    break;
                }
            }
        }
    }
}
