package com.fly.springcloud.service.impl;

import com.fly.springcloud.dao.PaymentDao;
import com.fly.springcloud.entity.Payment;
import com.fly.springcloud.service.PaymentSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author flyer
 * @date 2020-12-26
 */
@Service
public class PaymentService implements PaymentSerivce {

    @Resource
    private PaymentDao paymentDao;

    @Override public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
