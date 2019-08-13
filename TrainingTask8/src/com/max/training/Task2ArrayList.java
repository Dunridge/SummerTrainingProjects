package com.max.training;

import java.util.ArrayList;
import java.util.Arrays;

//parametrize this list
public class Task2ArrayList {
    private static int initialCapacity = 5;
    private static int currentSize;
    private static Object[] myObject, temp;
    private static int currentIndex = 0;

    public Task2ArrayList() {
        myObject = new Object[initialCapacity];
    }

    public Task2ArrayList(int size) {
        myObject = new Object[size];
    }

    void add(Object string) {
        myObject[currentIndex] = string;
        currentSize = myObject.length;
        currentIndex++;
        if(currentIndex == currentSize) {
            createDoubleSizedObjectArray(currentSize);
        }
    }

    private void createDoubleSizedObjectArray(int currentSize) {
        temp = myObject.clone();
        myObject = new Object[2 * currentSize];

        System.arraycopy(temp, 0, myObject, 0, currentSize);
    }

    void delete(Object string) {
        if(currentIndex == 0) {
            System.out.println("The list is empty");
        }
        currentIndex--;
    }

    public void printList() {
        Arrays.stream(trimToSize(myObject)).forEach(System.out::println);
    }

    private Object[] trimToSize(Object[] myObject) {
        int count = 0;
        for(Object i: myObject) {
            if(i != null) {
                count++;
            }
        }

        Object[] newArr = new Object[count];

        int index = 0;
        for(Object o: myObject) {
            if(o != null) {
                newArr[index++] = o;
            }
        }

        return newArr;
    }

}
