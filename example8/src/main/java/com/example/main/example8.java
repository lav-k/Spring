package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class example8 {

    public static void main(String[] args) {

        // Initializing Spring IOC Container
        var context = new ClassPathXmlApplicationContext("beans.xml");
        var vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+ vehicle.getName());

    }
}
