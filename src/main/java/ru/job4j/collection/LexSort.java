package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftM = left.split(". ");
        String[] rightM = right.split(". ");
        for (int i = 0; i < Math.min(leftM.length, rightM.length); i++) {
            if (Integer.parseInt(leftM[i]) != Integer.parseInt(rightM[i])) {
                return Integer.compare(Integer.parseInt(leftM[i]), Integer.parseInt(rightM[i]));
            }
        }
        return left.compareTo(right);
    }
}