package com.yanling.serviceribbon.controller;

import com.yanling.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanling
 * @time 2018-03-08-14:48
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hi")
    public String hiService(@RequestParam String name){
        return helloService.hiService(name);
    }
}
