package com.zq.springcloud.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient  //激活eureka中的DiscoveryClient实现
@SpringBootApplication
public class EurekaServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServiceApplication.class).web(true).run(args);
    }
}

