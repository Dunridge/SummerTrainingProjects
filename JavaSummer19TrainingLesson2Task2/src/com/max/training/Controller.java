package com.max.training;

import java.util.Map;
import java.util.Scanner;

public class Controller
{
    /**
     * A Model object to access the class
     */
    private Model model;
    /**
     *  A view object to access the text constants
     */
    private View view;

    private final int MAX_VALUE = 100;
    private int requiredValue;
    private int value;

    /**
     * A Scanner object for doing I/O
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * A constructor for the Controller class
     */
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        requiredValue = model.getValue();
    }

    /**
     * Contains the main logic of the program
     */
    public void processUser()
    {
        while(true)
        {
            value = scanner.nextInt();
            if (value < requiredValue)
            {
                model.addEntry(value, View.VALUE_IS_HIGHER);
                view.printMessage(View.PREVIOUS_TRY_STR + value + View.RANGE_STR + MAX_VALUE + View.RESULT_HIGHER);
            }
            else if (value < requiredValue)
            {
                model.addEntry(value, View.VALUE_IS_LOWER);
                view.printMessage(View.PREVIOUS_TRY_STR + value + View.RANGE_STR + MAX_VALUE + View.RESULT_LOWER);
            }
            else
            {
                view.printMessage(View.YOU_WON + value);
                for (Map.Entry<Integer, String> stringIntegerEntry: model.getHistory().entrySet())
                {
                    view.printHashMap(stringIntegerEntry);
                }
                break;
            }
        }
    }
}
