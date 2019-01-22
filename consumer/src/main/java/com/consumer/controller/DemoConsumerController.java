package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *  消费者控制层
 * @author chaom
 * @create 2019-01-16 11:10
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }

}