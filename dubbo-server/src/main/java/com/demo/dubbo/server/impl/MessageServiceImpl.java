package com.demo.dubbo.server.impl;

import com.demo.dubbo.lib.Message;
import com.demo.dubbo.lib.MessageService;
import com.demo.dubbo.lib.Person;
import org.apache.dubbo.config.annotation.Service;

import java.time.format.DateTimeFormatter;

@Service(retries = 3, loadbalance = "roundrobin")
public class MessageServiceImpl implements MessageService {
    @Override
    public Person messageToPerson(Message message) {
        Person person = new Person();
        person.setId(message.getId());
        person.setName(message.getName());
        person.setBirthday(message.getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        return person;
    }
}
