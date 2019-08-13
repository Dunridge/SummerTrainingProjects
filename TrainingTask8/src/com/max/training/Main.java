package com.max.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7));
        Task1 task1 = new Task1();
        task1.countOccurrence(ints);

        Task2ArrayList arrayList = new Task2ArrayList();
        arrayList.add(1);
        arrayList.add(2);

        arrayList.printList();

    }
}