package com.assoft.patterns.structere.composit;


import java.util.ArrayList;
import java.util.List;

public class ComplexClothing implements Clothing {

    private String type;
    private List<Clothing> children = null;
    public ComplexClothing(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Clothing> getChildren() {
        if(children == null) {
            children = new ArrayList<Clothing>();
        }
        return children;
    }

    public void setChildren(List<Clothing> children) {
        this.children = children;
    }

    @Override
    public void show() {
        System.out.println("Tür" + type);
        for(Clothing child : children) {
            child.show();
        }
        System.out.println("Toplam adet " + children.size());
    }
}
