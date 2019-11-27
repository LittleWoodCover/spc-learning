package spc.consumerribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * ribbon的断路器,直接加载方法名上,失败后调用同一个类下的其他方法
     * @return
     */
    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod = "fallCall")
    public String sayHi(){

        return restTemplate.getForObject("http://provider/provider/hello", String.class);
    }

    public String fallCall(){
        return "service not in use";
    }
}
