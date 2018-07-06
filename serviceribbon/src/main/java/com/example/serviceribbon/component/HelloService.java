package com.example.serviceribbon.component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent() {
     return restTemplate.getForObject("http://CONFIG-CLIENT/",String.class);
    }

    public String serviceFailure(){
        return "hello world service is not available !";
    }
}
