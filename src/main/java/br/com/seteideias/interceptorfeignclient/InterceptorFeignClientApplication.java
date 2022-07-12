package br.com.seteideias.interceptorfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class InterceptorFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorFeignClientApplication.class, args);
    }

}
