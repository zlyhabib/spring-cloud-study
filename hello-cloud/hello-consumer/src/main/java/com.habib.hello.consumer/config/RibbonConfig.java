package com.habib.hello.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class RibbonConfig {
    @Bean
    public IRule ribbonRule() {
        // 随机策略
        return new RandomRule();
    }
}
