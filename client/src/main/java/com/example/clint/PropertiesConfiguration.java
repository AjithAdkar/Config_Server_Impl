package com.example.clint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope

public class PropertiesConfiguration {
    @Value("${spring.test.profile}")
    private String profile;


    public String getprofile() {
        return profile;
    }

    public void setprofile(String value) {
        this.profile = value;
    }

}