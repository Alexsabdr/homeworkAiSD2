package cw2703;
import java.util.Scanner;

public class homework4 {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 10, 42, 27, 8, 9};
        int current = 0;
        for (int num : arr) {
            if (num >= 10 && num <= 99) {
                current++;
            }
        }

        int[] narr = new int[arr.length + current];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 != 0) {
                narr[j++] = arr[i] / 10;
                narr[j++] = arr[i] % 10;
            } else {
                narr[j++] = arr[i];
            }
        }

        mergeSort(narr, 0, narr.length - 1);

        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }

    }
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];


            for (int i = 0; i < n1; ++i) leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; ++j) rightArray[j] = arr[mid + 1 + j];

            int i = 0, j = 0;
            int k = left;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k++] = rightArray[j++];
                } else {
                    arr[k++] = leftArray[i++];
                }
            }

            while (i < n1) arr[k++] = leftArray[i++];

            while (j < n2) arr[k++] = rightArray[j++];
        }


}
