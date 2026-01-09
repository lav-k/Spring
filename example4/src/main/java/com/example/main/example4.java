package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example4 {

    public static void main(String[] args) {

        // Initializing Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        To avoid NoUniqueBeanDefinitionException WE CAN FETCH THE BEAN USING ITS NAME
        var veh = context.getBean(Vehicle.class);
        System.out.println("Object created using bean and fetched from the context: "+ veh.getName());


    }
}
