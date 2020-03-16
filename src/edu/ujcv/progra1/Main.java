package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {20,50,65,32,4,5,6,79,100,321,8654,6545,6454,642221,645479,978,9754,97978,42216,23,

        };
        HeapSort  h = new HeapSort();
        h.heapSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{20,50,65,32,4,5,6,79,100,321,8654,6545,6454,642221,645479,978,9754,97978,42216,23,


        };
        System.out.println("\n\ntarda "+ h.sort(elementos)+ " nanosegundos");
    }
}
