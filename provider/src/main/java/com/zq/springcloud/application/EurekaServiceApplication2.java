package com.zq.springcloud.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication2.class, args);
    }
}

