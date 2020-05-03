package com.jalasoft.practicenv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.jalasoft.practicenv.storage.StorageProperties;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Main {
    public static void main(String[] args){
        System.out.println("Hello!");
        SpringApplication.run(Main.class, args);
    }
}

