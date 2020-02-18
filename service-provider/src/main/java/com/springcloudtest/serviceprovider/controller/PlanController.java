package com.springcloudtest.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author liuziyang
 * @create 2020-02-18 20:00
 */
@RestController
public class PlanController {

    @RequestMapping("/plan")
    public String getPlan() {
        return "plan a";
    }
}
