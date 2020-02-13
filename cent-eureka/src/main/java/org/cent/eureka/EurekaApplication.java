package org.cent.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        System.out.println("---------------- Eureka server is starting ---------------");
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("---------------- Eureka server has been started on port 8761 ---------------");
    }
}
