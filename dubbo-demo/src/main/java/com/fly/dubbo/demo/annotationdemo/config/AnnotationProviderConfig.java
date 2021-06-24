package com.fly.dubbo.demo.annotationdemo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:34
 */
@Configuration
@EnableDubbo(scanBasePackages = " com.fly.dubbo.demo.annotationdemo.service.provider")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class AnnotationProviderConfig {
}
