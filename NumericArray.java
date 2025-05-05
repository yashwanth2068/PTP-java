import java.util.Scanner;

public class NumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        for (int x : a) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < a.length; i++) {
            int he = a[i];
            for (int j = 0; j < a.length; j++) {
                if (he < a[j]) {
                    a[i] = a[j];
                    a[j] = he;
                    he = a[i];
                }
            }
        }

        System.out.println("\nSorted array: ");
        for (int x : a) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}