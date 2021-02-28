package com.fly.dubbo.demo.impl;

import com.fly.dubbo.demo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.dubbo.rpc.RpcContext;
/**
* @author flyer
* @date 2021/2/28
*/
public class DemoServiceImpl implements DemoService {
    @Override public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name +
            ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override public void testVoid() {

    }
}
