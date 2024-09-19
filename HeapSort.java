import java.util.Scanner;

public class HeapSort {
    public void heapify(int[] A, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }
        if (right < n && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;
            heapify(A, n, largest);
        }
    }

    public void heapsort(int[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapify(A, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        HeapSort hs = new HeapSort();
        hs.heapsort(A);

        System.out.println("Heap sorted array:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
