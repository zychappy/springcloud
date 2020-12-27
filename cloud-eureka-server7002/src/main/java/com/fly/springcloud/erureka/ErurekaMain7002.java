package com.fly.springcloud.erureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author flyer
 * @date 2020-12-27
 */
@EnableEurekaServer
@SpringBootApplication
public class ErurekaMain7002 {
  public static void main(String[] args) {
      SpringApplication.run(ErurekaMain7002.class);
  }
}
