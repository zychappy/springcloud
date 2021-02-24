package com.fly.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @author flyer
* @date 2021/2/24
*/
@Configuration
public class MyRule {
    @Bean
    public IRule getMyRule(){
        return new RandomRule();
    }
}
