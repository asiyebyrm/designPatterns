package com.assoft.patterns.structere.composit;

public class Application {
    public static void main(String[] args) {
        PrimitiveClothing jacket = new PrimitiveClothing("Ceket");
        PrimitiveClothing trouser = new PrimitiveClothing("Pantolon");
        PrimitiveClothing tie = new PrimitiveClothing("Kravat");

        ComplexClothing suit = new ComplexClothing("Takım");
        suit.getChildren().add(jacket);
        suit.getChildren().add(trouser);
        suit.getChildren().add(tie);
        suit.show();

        ComplexClothing full = new ComplexClothing("Tam Takım");
        PrimitiveClothing shoes = new PrimitiveClothing("Ayakkabı");
        PrimitiveClothing socks = new PrimitiveClothing("Çorap");
        full.getChildren().add(suit);
        full.getChildren().add(shoes);
        full.getChildren().add(socks);
        full.show();

    }
}
