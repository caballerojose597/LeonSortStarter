package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {

        int[] array = {20,50,65,32,4,5,6,79,100,321,8654,6545,6454,642221,645479,978,9754,97978,42216,23};

        //HeapSort  h = new HeapSort();
        //h.heapSort(elementos);
        //MergeSort  m = new MergeSort();
        //elementos = m.mergeSort(elementos);
        //BubleSort  b = new BubleSort();
        //elementos = b.bubleSort(elementos);
        QuickSort  q = new QuickSort();
        int n = array.length;
        q.quickSort(array,0,n-1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        array = new int[]{20,50,65,32,4,5,6,79,100,321,8654,6545,6454,642221,645479,978,9754,97978,42216,23,


        };
        System.out.println("\n\ntarda "+ q.sort(array)+ " nanosegundos");
    }
}
