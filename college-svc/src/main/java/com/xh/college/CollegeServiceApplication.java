package com.xh.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CollegeServiceApplication {
    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(CollegeServiceApplication.class, args);
    }
}
