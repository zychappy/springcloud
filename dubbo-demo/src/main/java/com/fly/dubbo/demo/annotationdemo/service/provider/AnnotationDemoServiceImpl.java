package com.fly.dubbo.demo.annotationdemo.service.provider;

import com.fly.dubbo.demo.annotationdemo.service.provider.AnnotationDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhouyongchang
 * @Date 2021/6/24 9:55
 */
@DubboService
public class AnnotationDemoServiceImpl implements AnnotationDemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
            ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
