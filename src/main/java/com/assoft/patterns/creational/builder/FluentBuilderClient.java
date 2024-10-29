package com.assoft.patterns.creational.builder;

public class FluentBuilderClient {
    public static void main(String[] args) {
        Employee employee=new Employee.Builder()
                .id(501)
                .name("Yusuf Nalkesen")
                .salary(44230)
                .build();
        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary());
    }
}
