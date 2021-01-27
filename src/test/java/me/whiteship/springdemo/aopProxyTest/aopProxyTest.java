package me.whiteship.springdemo.aopProxyTest;

import me.whiteship.springdemo.aopProxy.EventService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//스프링 프레임워크 핵심기술 - 스프링 AOP: 프록시 기반 AOP

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class aopProxyTest {

    @Autowired
    EventService eventService;

    @Test
    public void test(){
        eventService.open();
        eventService.close();
        eventService.delete();
    }

}