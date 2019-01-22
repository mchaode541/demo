package com.provider.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.DemoService;

/**
 * 描述:
 * 服务提供类
 *
 * @author chaom
 * @create 2019-01-16 11:00
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "(from Spring Boot)";
    }
}