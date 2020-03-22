package edu.ujcv.progra1;

import java.util.Random;

public class Promedio {

    public static void main (String[] args){

        int[] array1 = new int [100000];
        int[] array2 = new int [100000];
        int[] array3 = new int [100000];
        int[] array4 = new int [100000];
        int[] array5 = new int [100000];

        Random R = new Random();

        for (int i= 0; i < array1.length; i++) {
            array1[i] = Math.abs(R.nextInt(10000));
            array2[i] = Math.abs(R.nextInt(10000));
            array3[i] = Math.abs(R.nextInt(10000));
            array4[i] = Math.abs(R.nextInt(10000));
            array5[i] = Math.abs(R.nextInt(10000));
        }

        HeapSort  h = new HeapSort();

        MergeSort  m = new MergeSort();

        BubleSort  b = new BubleSort();

        QuickSort  q = new QuickSort();

        long tiempo1 = h.sort(array1);
        long tiempo2 = h.sort(array2);
        long tiempo3 = h.sort(array3);
        long tiempo4 = h.sort(array4);
        long tiempo5 = h.sort(array5);
        double promedioHeapsort = (tiempo1+tiempo2+tiempo3+tiempo4+tiempo5)/5;
        System.out.println("promedio heapsort: " +promedioHeapsort);

         tiempo1 = m.sort(array1);
         tiempo2 = m.sort(array2);
         tiempo3 = m.sort(array3);
         tiempo4 = m.sort(array4);
         tiempo5 = m.sort(array5);
        double promedioMergesort = (tiempo1+tiempo2+tiempo3+tiempo4+tiempo5)/5;
        System.out.println("promedio mergesort: " +promedioMergesort);

        tiempo1 = b.sort(array1);
        tiempo2 = b.sort(array2);
        tiempo3 = b.sort(array3);
        tiempo4 = b.sort(array4);
        tiempo5 = b.sort(array5);
        double promedioBublesort = (tiempo1+tiempo2+tiempo3+tiempo4+tiempo5)/5;
        System.out.println("promedio bublesort: " +promedioBublesort);

        tiempo1 = q.sort(array1);
        tiempo2 = q.sort(array2);
        tiempo3 = q.sort(array3);
        tiempo4 = q.sort(array4);
        tiempo5 = q.sort(array5);
        double promedioQuicksort = (tiempo1+tiempo2+tiempo3+tiempo4+tiempo5)/5;
        System.out.println("promedio quicksort: " +promedioQuicksort);

    }

}
