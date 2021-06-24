package com.fly.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
* @author flyer
* @date 2021/2/28
*/
public class ProviderService {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
//         wait for embedded zookeeper start completely.
        Thread.sleep(1000);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-provider.xml");
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
