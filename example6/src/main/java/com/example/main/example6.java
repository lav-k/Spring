package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example6 {

    public static void main(String[] args) {

        // Initializing Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from spring component: "+ veh.getName());
        veh.printHello();
        veh.printHelloAgain();


    }
}
