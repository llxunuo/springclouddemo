package com.example.feignclient.component;

import com.example.feignclient.feign.IHelloFeign;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignFailue implements IHelloFeign {
    @Override
    public String sayHello() {
        return "hello world service is not available !";
    }
}
