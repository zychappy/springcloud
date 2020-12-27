package com.fly.springcloud.controller;

import com.fly.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author flyer
 * @date 2020-12-27
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://CLOUD-PAYMENT-SERVICE";
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        return restTemplate.getForObject(url+"/payment/get/"+id, CommonResult.class);
    }
}
