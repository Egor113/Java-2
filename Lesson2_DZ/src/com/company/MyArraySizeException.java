package com.company;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException(int index) {
        super(index);
    }

    public MyArraySizeException(String s) {
        super(s);
    }
}
