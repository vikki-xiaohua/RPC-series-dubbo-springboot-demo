package com.demo.dubbo.client;

import com.demo.dubbo.lib.HelloService;
import com.demo.dubbo.lib.Message;
import com.demo.dubbo.lib.MessageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class GreeterComponent {

    @Reference
    private HelloService helloService;

    @Reference
    private MessageService messageService;

    public void greeting(String name) {
        System.out.println(helloService.sayHello(name));
    }

    public void convert(Message message) {
        System.out.println(messageService.messageToPerson(message));
    }
}
