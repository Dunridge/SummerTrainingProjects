package com.max.training;

/*
* //bring together the logic in model and view with the use of the controller
* MVC Pattern:
*
* (*) Main
* (*) Model
* (*) View
* (*) Controller
*
* [Controller is the place for handling errors]
* TODO:
* (*) 1) You have to figure out where will you have the error handling (in the controller)
* (*) 2) The program is working
* (*) 3) Take apart the error handling (there's none)
* */

public class Main
{
    public static void main(String[] args)
    {
//        {
//            int x = 0;
//        }
//
//        x = 12;
        //System.out.println("x = " + x);
        //System.out.println(1+2+"text");
        //System.out.println("text"+1+2);

        //Initializing the objects...
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //Running the program...
        controller.processUser();
    }
}
