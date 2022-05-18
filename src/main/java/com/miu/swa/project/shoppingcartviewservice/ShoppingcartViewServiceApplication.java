package com.miu.swa.project.shoppingcartviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingcartViewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingcartViewServiceApplication.class, args);
    }

}
