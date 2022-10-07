package dev.mrgek.problems;

import java.util.*;

/*
 * problem: https://leetcode.com/problems/time-based-key-value-store/
 * */
class TimeMap {

    private final Map<String, HashMap<Integer, String>> keyTimeMap = new HashMap<>();

    public void set(String key, String value, int timestamp) {

        keyTimeMap.computeIfAbsent(key, s -> new HashMap<>());

        keyTimeMap.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if (!keyTimeMap.containsKey(key)) {
            return "";
        }

        for (int i = timestamp; i >= 1; --i) {

            if (keyTimeMap.get(key).containsKey(i)) {
                return keyTimeMap.get(key).get(i);
            }
        }

        return "";
    }
}

