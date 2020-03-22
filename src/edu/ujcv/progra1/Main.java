package edu.ujcv.progra1;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int [100000];
        Random R = new Random();
        for (int i= 0; i < array.length; i++) {
            array[i] = Math.abs(R.nextInt(10000));
        }

        //HeapSort  h = new HeapSort();
        //h.heapSort(array);
        //MergeSort  m = new MergeSort();
        //array = m.mergeSort(array);
        //BubleSort  b = new BubleSort();
        //array = b.bubleSort(array);
        QuickSort  q = new QuickSort();
        q.QuickSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\n\ntarda "+ q.sort(array)+ " milisegundos");
    }
}
