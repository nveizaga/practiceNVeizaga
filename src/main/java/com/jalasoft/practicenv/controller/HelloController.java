package com.jalasoft.practicenv.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.jalasoft.practicenv.storage.StorageService;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private StorageService storageService;

    public HelloController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping
    public String sayHello(@RequestParam(value="name") String name,
                           @RequestParam(value="lastName") String lastName,
                           @RequestParam(value="file") MultipartFile file){

        String nameFile = storageService.store(file);

        return "Hello " + name + " " + lastName + " " + "Your File: " + nameFile + " was uploaded successfully!";
    }
}
