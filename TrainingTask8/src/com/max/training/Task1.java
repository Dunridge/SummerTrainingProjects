package com.max.training;

import java.util.*;

public class Task1 {

    public void countOccurrence(List<Integer> ints) {
        Set<Integer> uniqueInts = new HashSet<>(ints); //unique elems
        for(Integer elem: uniqueInts) {
            System.out.println(elem + " - " + Collections.frequency(ints, elem));
        }
    }
}
