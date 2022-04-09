package dev.mrgek.algorithms;

import java.util.HashMap;
import java.util.Map;

/*
* problem: https://leetcode.com/problems/two-sum/
* */
public class TwoSum {

    public int[] solve(int[] numbers, int target) {

        final int[] indices = new int[2];

        final Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            numsMap.put(numbers[i], i);
        }


        for (int i = 0; i < numbers.length; i++) {

            final int difference = target - numbers[i];

            if (!numsMap.containsKey(difference)) {

                continue;
            }

            final int complement = numsMap.get(difference);

            if (i != complement) {

                indices[0] = i;
                indices[1] = complement;

                return indices;
            }
        }


        return indices;
    }
}
