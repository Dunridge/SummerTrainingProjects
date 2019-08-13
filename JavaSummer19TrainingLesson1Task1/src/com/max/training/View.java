package com.max.training;

public class View
{
    //defining the text constants...
    public static final String INPUT_STR_HELLO = "Input the string \"Hello\"";
    public static final String INPUT_STR_WORLD = "Input the string \"world!\"";
    public static final String WRONG_INPUT_STR_HELLO = "Wrong input! Please repeat and enter the word: \"Hello\"\n";
    public static final String WRONG_INPUT_STR_WORLD = "Wrong input! Please repeat and enter the word: \"world!\"\n";

    public void printMessage(String message)
    {
        System.out.println(message);
    }

}
