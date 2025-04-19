package ArrayOperation;

import java.util.Scanner;

public class UnionAndInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arrays:");
        int size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
        }

        int[] k = new int[a.length + b.length];
        int t = 0;

        // Add elements from array a
        for (int i = 0; i < a.length; i++) {
            int found = 0;
            for (int j = 0; j < t; j++) {
                if (k[j] == a[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                k[t] = a[i];
                t++;
            }
        }

        // Add elements from array b
        for (int i = 0; i < b.length; i++) {
            int found = 0;
            for (int j = 0; j < t; j++) {
                if (k[j] == b[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                k[t] = b[i];
                t++;
            }
        }

        System.out.println("Union Array:");
        for (int i = 0; i < t; i++) {
            System.out.print(k[i] + "\t");
        }

    
    }
}
