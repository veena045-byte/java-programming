import java.io.*;
import java.util.Scanner;

public class MergeSort{

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input size
        System.out.println("Enter size of the array: ");
        int n = in.nextInt();

        // Input array
        int[] arr = new int[n];
        System.out.println("Enter the array elements (one by one): ");
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }

        // Apply merge sort algo
        mergeSort(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted the array elements: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
