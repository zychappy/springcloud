package com.fly.springcloud.service;

import com.fly.springcloud.entity.Payment;

/**
 * @author flyer
 * @date
 */
public interface PaymentSerivce {
  int add(Payment payment);
  Payment getPaymentById(Long id);
}
