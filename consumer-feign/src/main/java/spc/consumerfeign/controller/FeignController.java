package spc.consumerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spc.consumerfeign.service.FeignService;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping("hello")
    public String hello(){
        return feignService.sayHello();
    }
}
