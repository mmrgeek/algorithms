package dev.mrgek.algorithms;

import java.util.Arrays;

public class KthLargest {

    private final int k;

    private int[] array;


    KthLargest(final int k, final int[] array) {

        this.k = k;
        this.array = array;
    }

    public int add(int val) {

        array = Arrays.copyOf(this.array, array.length + 1);

        array[array.length - 1] = val;

        Arrays.sort(array);

        return array[array.length - k];
    }
}
