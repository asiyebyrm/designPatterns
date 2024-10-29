package com.assoft.patterns.creational.factory;

public class ConcreteFactoryClient {
    public static void main(String[] args) {
//        JeansJacket jacket=new JeansJacket("Kot");
        Jacket jacket=JacketFactory.createJacket();
        System.out.println(jacket.getName());
    }
}
