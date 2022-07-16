package br.com.seteideias.interceptorfeignclient.interceptor.tentativa2;

import feign.Client;
import org.springframework.context.annotation.Bean;

public class FeignClientConfig {


    public FeignClientConfig() { }

    @Bean
    public Client client() {
        return new CustomFeignClient(null, null);
    }

}
