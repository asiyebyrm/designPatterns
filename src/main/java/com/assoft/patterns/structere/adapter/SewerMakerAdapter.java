package com.assoft.patterns.structere.adapter;

public class SewerMakerAdapter implements Maker {
    private Sewer sewer=new Sewer();

    @Override
    public void make(double start, double length, boolean zigzag) {
        String type= zigzag?"zigzag":"straight";
        sewer.make((int) start,(int) (start+length),type);
    }
}
