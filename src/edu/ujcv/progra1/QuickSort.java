package edu.ujcv.progra1;

public class QuickSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        int n = array.length;
        quickSort(array,0,n-1);

        long end = System.nanoTime();

        return end - start;
    }

    public static void quickSort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (A[i] <= pivote && i < j) i++;
            while (A[j] > pivote) j--;
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1)
            quickSort(A, izq, j - 1);
        if (j + 1 < der)
            quickSort(A, j + 1, der);
    }
}