package com.demo.dubbo.server.impl;

import com.demo.dubbo.lib.HelloService;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Welcome " + name + " at " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
