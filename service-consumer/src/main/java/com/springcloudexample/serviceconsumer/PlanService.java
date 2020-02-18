package com.springcloudexample.serviceconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author liuziyang
 * @create 2020-02-18 20:06
 */
@FeignClient(name = "feignClient", url = "localhost:8002")
public interface PlanService {

    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    public String test();
}
