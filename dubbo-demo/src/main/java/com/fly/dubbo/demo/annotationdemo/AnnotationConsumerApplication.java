package com.fly.dubbo.demo.annotationdemo;

import com.fly.dubbo.demo.annotationdemo.config.AnnotationConsumerConfig;
import com.fly.dubbo.demo.annotationdemo.service.consumer.AnntationConsumerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:33
 */

public class AnnotationConsumerApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            AnnotationConsumerConfig.class);
        context.start();
        final AnntationConsumerService annotationAction = (AnntationConsumerService)context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.err.println("annotation service "+hello);
    }
}
