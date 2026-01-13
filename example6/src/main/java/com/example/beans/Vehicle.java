package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    public void printHelloAgain()
    {
        System.out.println("Printing hello again from component vehicle bean");
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle Bean");
    }

    private String name;

}
