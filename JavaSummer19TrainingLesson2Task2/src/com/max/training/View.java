package com.max.training;

import java.util.Map;

public class View
{
    public static final String VALUE_IS_HIGHER = "Required value is higher";
    public static final String VALUE_IS_LOWER  = "Required value is lower";
    public static final String PREVIOUS_TRY_STR = "Previous try: ";
    public static final String YOU_WON = "YOU WON: ";
    public static final String RANGE_STR = "Range: 0-";
    public static final String RESULT_HIGHER = "Result: higer";
    public static final String RESULT_LOWER = "Result: lower";
    
    public void printMessage(String message)
    {
        System.out.println(message);
    }

    public void printHashMap(Map.Entry<Integer, String> stringIntegerEntry)
    {
        System.out.println(stringIntegerEntry);
    }
}
