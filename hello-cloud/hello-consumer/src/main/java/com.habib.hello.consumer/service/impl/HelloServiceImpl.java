package com.habib.hello.consumer.service.impl;

import com.habib.hello.consumer.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloEndPoint(String name) {
        return "调用远程服务失败,服务实现降级";
    }
}
