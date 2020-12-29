package com.fly.springcloud.controller;

import com.fly.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author flyer
 * @date 2020-12-27
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    private String url = "http://cloud-payment-service";
    private String zkUrl = "http://cloud-provider-payment";
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        return restTemplate.getForObject(url+"/payment/get/"+id, CommonResult.class);
    }
    @GetMapping("/getinfo/zk")
    public String getZkInfo(){
        return restTemplate.getForObject(zkUrl+"/payment/zk",String.class);
    }
}
