package com.example.feignclient.feign;

import com.example.feignclient.component.HelloFeignFailue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "CONFIG-CLIENT",fallback = HelloFeignFailue.class)
public interface IHelloFeign {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
