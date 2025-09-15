//To develop Java program for Insertion Sorting using Array.
import java.util.Scanner;

public class ISort {

    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0 && a[j + 1] < a[j]; j--) {
                int temp = a[j + 1];
                a[j + 1] = a[j];
                a[j] = temp;
            }
        }
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Elements in array:");
        printArray(a);

        sort(a);

        System.out.println("Elements after sorting:");
        printArray(a);

        s.close();
    }
}
