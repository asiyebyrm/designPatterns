package com.assoft.patterns.structere.composit;

public class PrimitiveClothing implements Clothing {
    private String name;
    public PrimitiveClothing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void show() {

    }
}
