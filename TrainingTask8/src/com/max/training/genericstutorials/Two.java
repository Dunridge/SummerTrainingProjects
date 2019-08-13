package com.max.training.genericstutorials;

public class Two implements GenericInterface<String> {
    @Override
    public String get() {
        return "Hi";
    }
}
