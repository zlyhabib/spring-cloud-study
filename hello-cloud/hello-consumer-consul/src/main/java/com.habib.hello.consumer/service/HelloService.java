package com.habib.hello.consumer.service;

import com.habib.hello.consumer.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hello-provider", fallback = HelloServiceImpl.class)
public interface HelloService {
    @GetMapping(value = "/hello/{name}")
    String helloEndPoint(@PathVariable("name") String name);

}

