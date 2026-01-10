package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello()
    {
        System.out.println("Printing hello from component vehicle bean");
    }

    private String name;

}
