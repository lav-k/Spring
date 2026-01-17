package com.example.beans;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle bean created by spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString(){
        return name;
    }

}
