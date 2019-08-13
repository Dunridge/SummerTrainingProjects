package com.max.training;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class Model
{
    private int value;

    LinkedHashMap<Integer, String> history;

    public Model()
    {
        history = new LinkedHashMap<>();
        Random random = new Random();
        value = random.nextInt(100)+1;
    }

    public void addEntry(int value, String description)
    {
        history.put(value, description);
    }

    public HashMap<Integer, String> getHistory()
    {
        return history;
    }

    public int getValue()
    {
        return value;
    }
}
