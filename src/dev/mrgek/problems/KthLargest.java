package dev.mrgek.problems;

import java.util.Arrays;

/*
* problem: https://leetcode.com/problems/kth-largest-element-in-a-stream/
* */

public class KthLargest {

    private final int k;

    private int[] array;


    public KthLargest(final int k, final int[] array) {

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
