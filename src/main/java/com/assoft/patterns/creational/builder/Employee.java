package com.assoft.patterns.creational.builder;

public class Employee {

    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static class Builder {
        private long id;
        private String name;
        private double salary;
        public Builder id(long id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }
        public Employee build() {
            return new Employee(id, name, salary);
        }
    }
}
