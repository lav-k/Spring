package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example10 {

    public static void main(String[] args) {

        // Initializing Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println("Person name from spring context is: "+ person.getName());
        System.out.println("vehicle name from spring context is: "+ veh.getName());
        System.out.println("vehicle that person owns is: "+ person.getVehicle());

    }
}
