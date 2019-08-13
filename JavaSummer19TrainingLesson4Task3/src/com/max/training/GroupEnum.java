package com.max.training;

public enum GroupEnum {
    FIRST_GROUP("FIRST_GROUP"),
    SECOND_GROUP("SECOND_GROUP"),
    THIRD_GROUP("THIRD_GROUP");

    private String value;

    GroupEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
