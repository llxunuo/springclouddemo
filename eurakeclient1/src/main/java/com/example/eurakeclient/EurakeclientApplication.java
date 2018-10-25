package com.example.eurakeclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope
public class EurakeclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/eurake1/h")
    public String home(){
        return "hello world from port "+port;
    }

    @Value("${hello}")
    String hello;

    @RequestMapping("/hello")
    public String hello(){
        return hello;
    }
}
