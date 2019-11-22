package spc.consumerfeign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import spc.consumerfeign.service.impl.FeignServiceHystrix;

/**
 * @FeignClient:
 * 必须是服务提供者的服务名称,application.name属性
 * @FeignClient value表明是哪个服务,fallback指明这个接口的实现类,
 * 如果服务调用失败,就调用接口实现类的同名方法
 */
@FeignClient(value = "provider",fallback = FeignServiceHystrix.class)
public interface FeignService {

    /**
     * 这个服务下的mapping值
     * @return
     */
    @RequestMapping("provider/hello")
    String sayHello();

}
