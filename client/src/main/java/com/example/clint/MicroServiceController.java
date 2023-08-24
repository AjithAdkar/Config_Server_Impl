package com.example.clint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Autowired
   private PropertiesConfiguration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }
}