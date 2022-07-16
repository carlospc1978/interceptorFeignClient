package br.com.seteideias.interceptorfeignclient.client;

import br.com.seteideias.interceptorfeignclient.entity.cargon.BodyToCargon;
import br.com.seteideias.interceptorfeignclient.entity.cargon.CargonResponse;
import feign.RequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "cargon", url = "${client.cargon.task.url}", configuration = {OrderFindCTECargon.Configuration.class})
public interface OrderFindCTECargon {
    //JA IMPORTADO PARA O SENDER
    @PostMapping(value = "/cargon?slug=SEND_PROCESSED_CTE", consumes = "application/json", produces = "application/json")
    CargonResponse getCTE(@RequestHeader("Authorization") String bearerToken, @RequestBody BodyToCargon bodyToCargon);

    class Configuration {
        @Bean
        public RequestInterceptor requestInterceptor() {
            return requestTemplate -> {
                requestTemplate.header("header_1", "novoValor");
            };
        }
    }
}
