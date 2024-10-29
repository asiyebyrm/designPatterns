package com.assoft.patterns.structere.adapter;

public class Sewer {
    public void make(int start, int end, String type) {
        if (type.equals("zigzag")) {
            System.out.println("Zikzak dikiş başlangıç " + +start + " bitiş " + end);
        } else if (type.equals("straight")) {
            System.out.println("Düz dikiş başlangıç " + start + " bitiş " + end);
        }
    }
}
