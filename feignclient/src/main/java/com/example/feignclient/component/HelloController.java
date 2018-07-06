package com.example.feignclient.component;

import com.example.feignclient.feign.IHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private IHelloFeign helloFeign;

    @RequestMapping("/")
    public String hello(){
        return helloFeign.sayHello();
    }
}
