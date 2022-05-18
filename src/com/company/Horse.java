package com.company;

public class Horse extends Animal{
    private String color;


    public Horse(double weight, int age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+color;
    }
}
