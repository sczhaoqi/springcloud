package com.zq.springcloud.application;

import org.springframework.stereotype.Component;

//熔断实现类
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

