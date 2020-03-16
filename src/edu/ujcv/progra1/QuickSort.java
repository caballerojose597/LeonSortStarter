package edu.ujcv.progra1;

public class QuickSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        quickSort(array);

        long end = System.nanoTime();

        return end - start;
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<=high-1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



}
