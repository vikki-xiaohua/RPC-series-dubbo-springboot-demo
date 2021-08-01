package com.demo.dubbo.client;

import com.demo.dubbo.lib.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
public class DubboClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboClientApplication.class, args);
        GreeterComponent component = context.getBean(GreeterComponent.class);

        //RPC1
        component.greeting("Dubbo RPC");

        //RPC2
        Message message = new Message();
        message.setId(UUID.randomUUID().toString());
        message.setName("Dubbo RPC");
        message.setDateTime(LocalDateTime.now());
        component.convert(message);
    }
}
