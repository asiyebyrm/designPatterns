package com.assoft.patterns.creational.singleton;

public class World {
    private long population;
    private static World world;

    private World() {
    }

    public static World getInstance() {
        if (world == null) {
            world = new World();
        }
        return world;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
