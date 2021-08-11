package com.example.servidor_eureka_intellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServidorEurekaIntellijApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServidorEurekaIntellijApplication.class, args);
    }

}
