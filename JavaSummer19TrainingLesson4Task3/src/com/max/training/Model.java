package com.max.training;

public class Model
{
    private String surnameOfSubscriber;
    private String nameOfSubscriber;
    private String patronimicOfSubscriber;
    private String enteredData;
    private String nicknameOfSubscriber;
    private String commentaryOfSubscriber;
    private String groupOfSubscriber;
    private String homeNumber;
    private String phoneNumber;
    private String secondPhoneNumber;
    private String emailOfSubscriber;
    private String skypeOfSubscriber;
    private Address address;
    private String fullAddress;
    private String datesOfEntryToPhoneBook;
    private String lastChangeEntryDates;
    private String enteredByUser;

    public String getGroupOfSubscriber() {
        return groupOfSubscriber;
    }


    public Address getAddress() {
        return address;
    }


    public String getSurnameOfSubscriber() {
        return surnameOfSubscriber;
    }

    public void setGroupOfSubscriber(String groupOfSubscriber) {
        this.groupOfSubscriber = groupOfSubscriber;
    }

    public void setSurnameOfSubscriber(String surnameOfSubscriber) {
        this.surnameOfSubscriber = surnameOfSubscriber;
    }

    public String getNameOfSubscriber() {
        return nameOfSubscriber;
    }

    public void setNameOfSubscriber(String nameOfSubscriber) {
        this.nameOfSubscriber = nameOfSubscriber;
    }

    public String getPatronimicOfSubscriber() {
        return patronimicOfSubscriber;
    }

    public void setPatronimicOfSubscriber(String patronimicOfSubscriber) {
        this.patronimicOfSubscriber = patronimicOfSubscriber;
    }

    public String getEnteredData() {
        return enteredData;
    }

    public void setEnteredData(String enteredData) {
        this.enteredData = enteredData;
    }

    public String getNicknameOfSubscriber() {
        return nicknameOfSubscriber;
    }

    public void setNicknameOfSubscriber(String nicknameOfSubscriber) {
        this.nicknameOfSubscriber = nicknameOfSubscriber;
    }

    public String getCommentaryOfSubscriber() {
        return commentaryOfSubscriber;
    }

    public void setCommentaryOfSubscriber(String commentaryOfSubscriber) {
        this.commentaryOfSubscriber = commentaryOfSubscriber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getEmailOfSubscriber() {
        return emailOfSubscriber;
    }

    public void setEmailOfSubscriber(String emailOfSubscriber) {
        this.emailOfSubscriber = emailOfSubscriber;
    }

    public String getSkypeOfSubscriber() {
        return skypeOfSubscriber;
    }

    public void setSkypeOfSubscriber(String skypeOfSubscriber) {
        this.skypeOfSubscriber = skypeOfSubscriber;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getDatesOfEntryToPhoneBook() {
        return datesOfEntryToPhoneBook;
    }

    public void setDatesOfEntryToPhoneBook(String datesOfEntryToPhoneBook) {
        this.datesOfEntryToPhoneBook = datesOfEntryToPhoneBook;
    }

    public String getLastChangeEntryDates() {
        return lastChangeEntryDates;
    }

    public void setLastChangeEntryDates(String lastChangeEntryDates) {
        this.lastChangeEntryDates = lastChangeEntryDates;
    }

    public String getEnteredByUser() {
        return enteredByUser;
    }

    public void setEnteredByUser(String enteredByUser) {
        this.enteredByUser = enteredByUser;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
