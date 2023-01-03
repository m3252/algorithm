package structure.array.sort;

/**
 * 평균 O(n log n)
 * 최악 O(n^2)
 * 메모리 O(log n)
 */

public class QuickSort {

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {

        int part2 = partition(arr, start, end);

        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }

        if (part2 < end) {
            quickSort(arr, part2, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(end + start) / 2]; // 0
        while (start <= end) { // 0 <= 9
            while (arr[start] < pivot) { // 3 < 0
                start++;
            }
            while (arr[end] > pivot) { // 9 > 0
                end--;
            }
            if (start <= end) { // 0 <= 8
                swap(arr, start, end);
                start++; // 1
                end--; // 7
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void print(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4, 1, 0, 5, 7, 6, 8, 9};
        print(array);
        quickSort(array);
        print(array);
    }
}
