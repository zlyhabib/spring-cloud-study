package com.habib.hello.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hello-provider"/*, fallback = HelloServiceFallback.class*/)
public interface HelloService {
    @GetMapping(value = "/hello/{name}")
    String callHello(@PathVariable("name") String name);
}

