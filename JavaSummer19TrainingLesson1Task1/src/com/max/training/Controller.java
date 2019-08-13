package com.max.training;

import java.util.Scanner;

public class Controller
{
    //constants: you don't have any...
    //regex: you don't have any...

    private Model model;
    private View view;

    //constructor
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    //the Work method
    //the method with the logic of your program
    public void processUser()
    {
        Scanner sc = new Scanner(System.in);

        model.setMessage1(inputStringValueWithScanner(sc));
        model.setMessage2(inputStringValueWithScanner(sc));

        view.printMessage(model.concatTwoStrings());
    }

    public String inputStringValueWithScanner(Scanner sc)
    {

        view.printMessage(View.INPUT_STR_HELLO);
        view.printMessage(View.INPUT_STR_WORLD);

        while(true)
        {
            String result = sc.nextLine();

            if(result != null && result.equals("Hello"))
            {
                return result;
            }
            if(result != null && result.equals("world!"))
            {
                return result;
            }

        }
    }
}
