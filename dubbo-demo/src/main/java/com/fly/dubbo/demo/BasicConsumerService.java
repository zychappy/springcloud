package com.fly.dubbo.demo;

import com.fly.dubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author flyer
* @date 2021/2/28
*/
public class BasicConsumerService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.err.println(hello);

        //        System.out.println("start void test...");
        //        demoService.testVoid();
    }
}
