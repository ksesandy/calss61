package com.tom.box;

public abstract class Box {
    int length;
    int height;
    int width;


    public boolean validate(int a, int b, int c){
        return (a <= length && b <= width && c <= height);

    }

    public abstract String getName();

    public abstract int  getPrice();

}
