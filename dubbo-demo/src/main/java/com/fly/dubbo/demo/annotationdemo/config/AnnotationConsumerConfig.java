package com.fly.dubbo.demo.annotationdemo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:34
 */
@Configuration
@EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.simple.annotation.action")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
@ComponentScan(value = {"com.fly.dubbo.demo.annotationdemo.service.consumer"})
public class AnnotationConsumerConfig {
}
