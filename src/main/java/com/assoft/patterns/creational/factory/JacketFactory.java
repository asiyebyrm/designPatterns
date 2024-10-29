package com.assoft.patterns.creational.factory;

import com.assoft.patterns.creational.factory.leather.LeatherJacket;
import com.assoft.patterns.creational.factory.jeans.JeansJacket;

public class JacketFactory {

    public static Jacket createJacket() {
//        return new JeansJacket("Kot");
        return new LeatherJacket("Leather");
    }

    public static Jacket createJacket(String material) {
        return switch (material) {
            case "leather" -> new LeatherJacket("Leather");
            case "jeans" -> new JeansJacket("Jeans");
            default -> throw new IllegalArgumentException("Invalid material");
        };
    }
    public static Jacket createJacket(MaterialType material) {
        return switch (material) {
            case LEATHER -> new LeatherJacket("Leather");
            case JEANS -> new JeansJacket("Jeans");
        };
    }
}
