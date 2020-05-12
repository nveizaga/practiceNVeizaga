package com.jalasoft.practicenv;

import com.jalasoft.practicenv.transport.Bicycle;
import com.jalasoft.practicenv.transport.Car;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.jalasoft.practicenv.storage.StorageProperties;
import com.jalasoft.practicenv.controller.ListLandTransport;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Main {
    public static void main(String[] args){

        System.out.println("Hello!");
        System.out.println("**************************Practice3*************************");
        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("Cross",500,false,false));
        trans.addLand(new Car("Audi", 20000, true,false));
        trans.display();
        SpringApplication.run(Main.class, args);
    }
}

