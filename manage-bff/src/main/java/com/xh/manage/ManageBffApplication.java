package com.xh.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Create By IntelliJ IDEA
 *
 * @author XieHua
 * @date 2020-05-26
 */
@SpringBootApplication
@EnableFeignClients({"com.xh"})
public class ManageBffApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageBffApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
