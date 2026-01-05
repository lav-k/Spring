package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("bmw");
        System.out.println("Object created without adding it into the spring context: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */

        // Initializing Spring IOC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println("Object created using bean and fetched from the context: "+ veh.getName());

        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */

        var num = context.getBean(Integer.class);
        System.out.println("Object created using bean and fetched from the context: "+ num);

        var hello = context.getBean(String.class);
        System.out.println("Object created using bean and fetched from the context: "+ hello);

    }
}
