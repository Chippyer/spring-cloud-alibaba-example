package com.chippy.springcloudalibaba;

import com.chippy.feign.annotation.EnableFeignClientHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * marketing application start the class
 *
 * @author: chippy
 * @datetime 2021-01-18 17:12
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableFeignClientHelper
public class MarketingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketingApplication.class, args);
    }

}
