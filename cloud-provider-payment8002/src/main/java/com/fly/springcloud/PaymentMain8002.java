package com.fly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author flyer
 * @date 2020-12-26
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class PaymentMain8002 {
  public static void main(String[] args) {
      SpringApplication.run(PaymentMain8002.class,args);
  }
}
