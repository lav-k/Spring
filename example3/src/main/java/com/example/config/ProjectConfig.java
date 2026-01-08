package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value = "ferrariVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Primary
    @Bean("bmwVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

}
