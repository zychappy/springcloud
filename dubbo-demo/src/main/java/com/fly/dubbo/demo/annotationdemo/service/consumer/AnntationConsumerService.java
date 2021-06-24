package com.fly.dubbo.demo.annotationdemo.service.consumer;

import com.fly.dubbo.demo.annotationdemo.service.provider.AnnotationDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:28
 */
@Component("annotationAction")
public class AnntationConsumerService {
    @DubboReference
    private AnnotationDemoService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}
