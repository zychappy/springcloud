package com.fly.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author flyer
 * @date 2020-12-28
 */
@RestController
public class PaymentController {

  @Value("${server.port}")
  private String port;

  @GetMapping("/payment/zk")
  public String getMsg() {
    return "springcloud with zookeeper server port:" + port + ",UUID:" + UUID.randomUUID();
  }
}
