package ArrayOperation;

import java.util.Scanner;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the arrays:");
        int size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
        }

        // ------------------- Union -------------------
        int[] union = new int[a.length + b.length];
        int u = 0;

        // Add elements of first array
        for (int i = 0; i < a.length; i++) {
            int found = 0;
            for (int j = 0; j < u; j++) {
                if (union[j] == a[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                union[u] = a[i];
                u++;
            }
        }

        // Add elements of second array
        for (int i = 0; i < b.length; i++) {
            int found = 0;
            for (int j = 0; j < u; j++) {
                if (union[j] == b[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                union[u] = b[i];
                u++;
            }
        }

        System.out.println("Union of Arrays:");
        for (int i = 0; i < u; i++) {
            System.out.print(union[i] + "\t");
        }

        
        int[] inter = new int[Math.min(a.length, b.length)];
        int t = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    // Check if already added
                    int found = 0;
                    for (int k = 0; k < t; k++) {
                        if (inter[k] == a[i]) {
                            found = 1;
                            break;
                        }
                    }
                    if (found == 0) {
                        inter[t] = a[i];
                        t++;
                    }
                    break;
                }
            }
        }

        System.out.println("\nIntersection of Arrays:");
        for (int i = 0; i < t; i++) {
            System.out.print(inter[i] + "\t");
        }

    }
}
