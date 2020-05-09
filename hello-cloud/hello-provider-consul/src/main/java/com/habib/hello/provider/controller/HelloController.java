package com.habib.hello.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return port + ": Hello, " + name + "!";
    }
}
