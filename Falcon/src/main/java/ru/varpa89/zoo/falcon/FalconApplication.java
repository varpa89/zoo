package ru.varpa89.zoo.falcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author varpa89
 * @since 12.10.2016
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class FalconApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello World! Falcon is here!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FalconApplication.class, args);
    }
}
