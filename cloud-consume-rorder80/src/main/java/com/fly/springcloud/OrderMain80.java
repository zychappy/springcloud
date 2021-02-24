package com.fly.springcloud;

import com.fly.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author flyer
 * @date 2020-12-26
 *
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 默认会加载数据库组件，找不到数据库url就会报错
@RibbonClient(name = "cloud-payment-service",configuration = MyRule.class)
public class OrderMain80 {
  public static void main(String[] args) {
      SpringApplication.run(OrderMain80.class,args);
  }
}
