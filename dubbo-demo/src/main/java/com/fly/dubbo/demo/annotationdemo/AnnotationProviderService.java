package com.fly.dubbo.demo.annotationdemo;

import com.fly.dubbo.demo.EmbeddedZooKeeper;
import com.fly.dubbo.demo.annotationdemo.config.AnnotationProviderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:41
 */
public class AnnotationProviderService {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        //         wait for embedded zookeeper start completely.
        Thread.sleep(1000);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            AnnotationProviderConfig.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
