package com.demo.dubbo.server;

import com.demo.dubbo.server.ext.EmbeddedZooKeeper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboServerApplication {

    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, true).start();
        SpringApplication.run(DubboServerApplication.class, args);
    }
}
