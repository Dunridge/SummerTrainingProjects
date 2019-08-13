package com.max.training;

import java.util.Scanner;
import java.util.regex.*;

import static com.max.training.GroupEnum.FIRST_GROUP;
import static com.max.training.GroupEnum.SECOND_GROUP;
import static com.max.training.GroupEnum.THIRD_GROUP;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner;
    private int counter = 0;
    Address address = new Address();


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
        
    }
    
    //view.printMessage --> change to --> view.printMessage
    public void processUser() {
        while (model.getLastChangeEntryDates() == null) {
            String input = inputStringValueWithScanner(scanner);
            switch (counter) {
                case 0: {
                    if (input.matches(View.REGEX_CASE0)) {
                        view.printMessage(View.SURNAME_SET);
                        model.setSurnameOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 1: {
                    if (input.matches(View.REGEX_CASE1)) {
                        view.printMessage(View.NAME_SET);
                        model.setNameOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }
                    break;
                }
                case 2: {
                    if (input.matches(View.REGEX_CASE2)) {
                        view.printMessage(View.PATRONIMIC_SET);
                        model.setPatronimicOfSubscriber(input);
                        model.setEnteredData(model.getSurnameOfSubscriber() + " "
                                + model.getNameOfSubscriber().charAt(0) + ".");

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 3: {
                    if (input.matches(View.REGEX_CASE3)) {
                        view.printMessage(View.NICKNAME_SET);
                        model.setNicknameOfSubscriber(input);
                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 4: {
                    //it doesn't require a regex
                    view.printMessage(View.COMMENTARY_SET);
                    model.setCommentaryOfSubscriber(input);

                    counter++;

                    break;
                }
                case 5: {
                    if (input.equals(FIRST_GROUP.getValue()) ||
                            input.equals(SECOND_GROUP.getValue()) ||
                            input.equals(THIRD_GROUP.getValue())) {
                        view.printMessage(View.GROUP_SET);
                        model.setGroupOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 6: {
                    if (input.matches(View.REGEX_CASE6)) {
                        view.printMessage(View.HOME_NUMBER_SET);
                        model.setHomeNumber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 7: {
                    if (input.matches(View.REGEX_CASE7)) {
                        view.printMessage(View.PHONE_NUMBER_SET);
                        model.setPhoneNumber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 8: {
                    if (input.matches(View.REGEX_CASE8)) {
                        view.printMessage(View.SCD_NUMBER_SET);
                        model.setSecondPhoneNumber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 9: {
                    if (input.matches(View.REGEX_CASE9)) {
                        view.printMessage(View.EMAIL_SUBSCRIBER_SET);
                        model.setEmailOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 10: {
                    if (input.matches(View.REGEX_CASE10)) {
                        view.printMessage(View.SKYPE_SET);
                        model.setSkypeOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
                case 11: {
                    if (input.matches(View.REGEX_CASE11)) {
                        view.printMessage(View.INDEX_SET);
                        address.setIndexOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT);
                    }
                    break;
                }
                case 12: {
                    if (input.matches(View.REGEX_CASE12)) {
                        view.printMessage(View.CITY_SET);
                        address.setCityOfResidence(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }

                case 13: {
                    if (input.matches(View.REGEX_CASE13)) {
                        view.printMessage(View.CITY_SET);
                        address.setCityOfResidence(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT);
                    }

                    break;
                }

                case 14: {
                    if (input.matches(View.REGEX_CASE14)) {
                        view.printMessage(View.HOUSE_NUMBER);
                        address.setHouseNumberOfSubscriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT);
                    }

                    break;
                }

                case 15: {
                    if (input.matches(View.REGEX_CASE15)) {
                        view.printMessage(View.FLAT_NUMBER);
                        address.setFlatNumberOfSubsriber(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT);
                    }

                    address.setAddressOfSubscriber(address.getIndexOfSubscriber() + ", " +
                                address.getCityOfResidence() + ", " + address.getStreetOfSubscriber()+ ", " +
                                address.getHouseNumberOfSubscriber() + ", " + address.getFlatNumberOfSubsriber() + ".");

                    model.setAddress(address);

                    break;
                }

                case 16: {
                    if (input.matches(View.REGEX_CASE16)) {
                        view.printMessage(View.DATES_SET); //in the format of 2000-01-01T00:00:00
                        model.setDatesOfEntryToPhoneBook(input);

                        counter++;
                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }

                case 17: {
                    if (input.matches(View.REGEX_CASE17)) {
                        view.printMessage(View.LAST_SET);
                        model.setLastChangeEntryDates(input);

                        counter++;

                    } else {
                        view.printMessage(View.WRONG_INPUT); 
                    }

                    break;
                }
            }
        }

        view.printAllOfTheInfo(model);
    }

    public static String inputStringValueWithScanner(Scanner sc) {
        return sc.nextLine();
    }

}
