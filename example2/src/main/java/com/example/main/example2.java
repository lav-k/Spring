package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example2 {

    public static void main(String[] args) {

        // Initializing Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        To avoid NoUniqueBeanDefinitionException WE CAN FETCH THE BEAN USING ITS NAME
        var veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Object created using bean and fetched from the context: "+ veh.getName());


    }
}
