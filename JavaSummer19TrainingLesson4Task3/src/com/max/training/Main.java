package com.max.training;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}

//
//public class Regex {
//    //more than 2 symbols, till 20, 1 - uppercase
//    public static final String SURNAME = "[A-Z][a-z]{2,20}|[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ]{2,20}";
//    public static final String NAME = "[A-Z][a-z]{2,20}|[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ]{2,20}";
//    public static final String NICKNAME = "([a-zA-Z0-9_.-]){2,20}";
//
//    public static final String COMMENT = ".{0,1000}";
//    //enum with groupname
//    public static final String GROUP = "[A-Za-z|А-ЩЬЮЯЇІЄҐа-щьюяїієґ ]{1,40}+";
//
//    public static final String MOBILE_PHONE = "\\+?([0-9]{3})?([0-9]{2})?([0-9]{7})";
//    public static final String HOME_PHONE = "";
//
//    public static final String EMAIL = "[\\w.!#$%&’*+\\/=?^`{|}~-]+@[\\w-]+(?:\\.[\\w-]+)*";
//    public static final String SKYPE = "";
//
//    public static final String INDEX = "[0-9]{5}";
//    public static final String CITY = "[A-Z][A-Za-z- ]{1,30}|[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,30}";
//    public static final String STREET = "[A-Z][A-Za-z- ]{1,30}|[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,30}";
//    public static final String HOME_NUMBER = "[0-9]{1,3}[(A-Za-z|А-ЩЬЮЯЇІЄҐа-щьюяїієґ)]?(\\/[0-9]{1,3})?";
//    public static final String FLAT_NUMBER = "[0-9]{1,4}[(a-z|а-щьюяїієґ)]?";
//
//    public static final String FULL_ADDRESS = "";
//
//    public static final String LAST_RECORD = "\\d{4}-\\d{2}-\\d{2}";
//    public static final String LAST_RECORD_CHANGE = "\\d{4}-\\d{2}-\\d{2}$";
//
//
//}
