package spc.consumerfeign.service.impl;

import org.springframework.stereotype.Component;
import spc.consumerfeign.service.FeignService;

@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String sayHello() {
        return "sorry, the service is not in use";
    }
}
