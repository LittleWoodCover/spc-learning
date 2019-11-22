package spc.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("hello")
    public String hello(){

        System.out.println("called me ...");
        return "Hello World!";
    }

}
