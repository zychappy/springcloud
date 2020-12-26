package com.fly.springcloud.dao;

import com.fly.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int add(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
