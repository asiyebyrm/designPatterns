package com.assoft.patterns.structere.adapter;

public class AdapterTests {
    public static void main(String[] args) {
    Maker maker=new SewerMakerAdapter();
    maker.make(100,50,true);
    }
}
