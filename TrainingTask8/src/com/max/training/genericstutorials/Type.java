package com.max.training.genericstutorials;

public class Type<String, T> {
    String name;
    T data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void sayInfo(){
        System.out.println(getData());
        System.out.println(getName());
    }
}
