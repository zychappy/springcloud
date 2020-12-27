package com.fly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author flyer
 * @date 2020-12-26
 *
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 默认会加载数据库组件，找不到数据库url就会报错
public class OrderMain80 {
  public static void main(String[] args) {
      SpringApplication.run(OrderMain80.class,args);
  }
}
