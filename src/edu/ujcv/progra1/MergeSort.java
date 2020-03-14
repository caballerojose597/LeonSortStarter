package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] mergeSort(int[] a){
        return new int[5];
    }

    public static int[] merge(int[] a, int[] b ){
        int [] c = new int[a.length + b.length];
        int j =0, k = 0, i;
        for (i = 0; i < c.length && j < a.length && k < b.length; i++) {
            if(a[j] < b[k]){
                c[i] = a[j++];
            }
            else{
                c[i] = b[k++];
            }

        }

        for(; i< c.length;i++){
            if(j<a.length){
                c[i] = a[j++];
            }
            if(k<b.length){
                if(k<b.length){
                    c[i] = b[k++];
                }
            }
        }

        return new int[5];
    }


}
