package com.springcloudexample.serviceconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author liuziyang
 * @create 2020-02-18 20:13
 */
@Slf4j
@RestController
public class WebController {

    @Autowired
    private PlanService planService;

    @GetMapping("/test")
    public String test() {
        String result = planService.test();
        log.info("get result [{}] from service provider.", result);
        return "success!";
    }

}
