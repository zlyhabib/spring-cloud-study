package com.habib.hello.consumer.controller;

import com.habib.hello.consumer.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return helloService.callHello(name);
    }

    ;
}
