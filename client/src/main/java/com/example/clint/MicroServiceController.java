package com.example.clint;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MicroServiceController {
 Logger log = Logger.getLogger("MicroServiceController");
    @Autowired
   private PropertiesConfiguration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){

 log.info("properties :" + configuration.getProfiles());
        return configuration.getValue();
    }
}