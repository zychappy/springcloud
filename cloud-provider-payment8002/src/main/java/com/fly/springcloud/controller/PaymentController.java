package com.fly.springcloud.controller;

import com.fly.springcloud.entity.CommonResult;
import com.fly.springcloud.entity.Payment;
import com.fly.springcloud.service.PaymentSerivce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author flyer
 * @date 2020-12-26
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentSerivce paymentSerivce;

    @PostMapping("/payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){
        log.info("create payment,{}",payment);
        int r = paymentSerivce.add(payment);
        if (r > 0){
            return new CommonResult(200,"success");
        }else{
            return new CommonResult(444,"create payment faile");
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymenById(@PathVariable("id") Long id){
        Payment payment = paymentSerivce.getPaymentById(id);
        if(payment != null){
           return new CommonResult(200,"success",payment);
        }else {
            return new CommonResult(444,"failed");
        }
    }
}
