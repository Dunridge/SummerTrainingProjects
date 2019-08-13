package com.max.training;

public class View
{
    public static final String INPUT_SURNAME = "Enter the surname of the subscriber: ";
    public static final String INPUT_NAME = "Input the name of the subscriber: ";
    public static final String INPUT_PATRONIMIC = "Input the patronimic of the subscriber: ";
    public static final String INPUT_NICKNAME = "Input the nickname of the subscriber: ";
    public static final String INPUT_COMMENTARY = "Input your commentary: ";
    public static final String INPUT_HOME_PHONE_NUMBER = "Enter your home number: ";
    public static final String INPUT_MOBILE_PHONE = "Enter your mobile phone: ";
    public static final String INPUT_SECOND_MOBILE_PHONE = "Enter your second mobile phone: ";
    public static final String INPUT_EMAIL = "Input your email: ";
    public static final String INPUT_SKYPE = "Input your Skype: ";
    //п.13.
    public static final String INPUT_INDEX = "Input your index: ";
    public static final String INPUT_CITY = "Input your city of residence: ";
    public static final String INPUT_STREET = "Input the street of residence: ";
    public static final String INPUT_HOUSE_NUMBER = "Input the house number: ";
    public static final String INPUT_FLAT_NUMBER = "Input the flat number: ";
    //Строка полного адреса сформированного из данных п.13.
    public static final String INPUT_DATES_OF_CHANGE = "Input the last dates of change: ";
    public static final String INPUT_LAST_CHANGE = "Input last dates of change: ";


    //put regexes here...
    public static final String WRONG_INPUT = "Wrong input!";
    public static final String SURNAME_SET = "The surname of the subscriber is set.";
    public static final String NAME_SET = "The name of the Subscriber is set.";
    public static final String REGEX_CASE0 = "([a-zA-Z]{3,30}\\s*)+";
    public static final String REGEX_CASE1 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE2 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE3 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE6 = "\\+?[\\d \\- ()]{5,}";
    public static final String REGEX_CASE7 = "\\+?[\\d \\- ()]{5,}";
    public static final String REGEX_CASE8 = "\\+?[\\d \\- ()]{5,}";
    public static final String REGEX_CASE9 = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    public static final String REGEX_CASE10 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE11 = "\\d{4,}";
    public static final String REGEX_CASE12 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE13 = "[a-zA-Z]{3,30}";
    public static final String REGEX_CASE14 = "^[-+]?\\d*$";
    public static final String REGEX_CASE15 = "^[-+]?\\d*$";
    public static final String REGEX_CASE16 = "20\\d{2}(-|\\/)((0[1-9])|(1[0-2]))(-|\\/)((0[1-9])|([1-2][0-9])|(3[0-1]))(T|\\s)(([0-1][0-9])|(2[0-3])):([0-5][0-9]):([0-5][0-9])";
    public static final String REGEX_CASE17 = "20\\d{2}(-|\\/)((0[1-9])|(1[0-2]))(-|\\/)((0[1-9])|([1-2][0-9])|(3[0-1]))(T|\\s)(([0-1][0-9])|(2[0-3])):([0-5][0-9]):([0-5][0-9])";
    public static final String PATRONIMIC_SET = "The patronimic name is set.";
    public static final String NICKNAME_SET = "The nickname of the subscriber is set.";
    public static final String COMMENTARY_SET = "The commentary of the Subscriber is set.";
    public static final String GROUP_SET = "The group of the Subscriber is set";
    public static final String HOME_NUMBER_SET = "The home number of the Subscriber is set";
    public static final String PHONE_NUMBER_SET = "The phone number of the Subscriber is set.";
    public static final String SCD_NUMBER_SET = "The second phone number of the Subscriber is set.";
    public static final String EMAIL_SUBSCRIBER_SET = "The email of the Subscriber is set";
    public static final String SKYPE_SET = "The Skype of the Subscriber is set.";
    public static final String INDEX_SET = "The index of the Subscriber is set";
    public static final String CITY_SET = "The city of residence is set.";
    public static final String STREET_SET = "The street of Subscriber is set.";
    public static final String HOUSE_NUMBER = "The house number of Subscriber is set.";
    public static final String FLAT_NUMBER = "The flat number of Subscriber is set.";
    public static final String DATES_SET = "Dates of change are set.";
    public static final String LAST_SET = "Last change entry dates are set.";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printAllOfTheInfo(Model model)
    {
        System.out.println("The surname is " + model.getSurnameOfSubscriber());
        System.out.println("The name is " + model.getNameOfSubscriber());
        System.out.println("The patronimic is " + model.getPatronimicOfSubscriber());
        System.out.println("The entered data is " + model.getEnteredData());
        System.out.println("The nickname is " + model.getNicknameOfSubscriber());
        System.out.println("The commentary is " + model.getCommentaryOfSubscriber());
        System.out.println("The group of Subscriber is " + model.getGroupOfSubscriber());
        System.out.println("The home phone of Subscriber is " + model.getHomeNumber());
        System.out.println("The mobile phone of Subscriber is " + model.getPhoneNumber());
        System.out.println("The second phone number of Subscriber is " + model.getSecondPhoneNumber());
        System.out.println("The email of subscriber is " + model.getEmailOfSubscriber());
        System.out.println("The Skype of Subscriber is " + model.getEmailOfSubscriber());
        // with index, city of residence, street, house number, flat number
        System.out.println("The full address is " + model.getAddress().getAddressOfSubscriber());
        System.out.println("Dates of last entry: " + model.getDatesOfEntryToPhoneBook());
        System.out.println("Dates of last change" + model.getLastChangeEntryDates());
    }
}
