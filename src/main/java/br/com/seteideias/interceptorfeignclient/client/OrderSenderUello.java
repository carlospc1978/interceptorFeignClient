package br.com.seteideias.interceptorfeignclient.client;

import br.com.seteideias.interceptorfeignclient.entity.uello.OrderUello;
import br.com.seteideias.interceptorfeignclient.entity.uello.OrderUelloResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "uello", url = "${client.uello.task.url}")
public interface OrderSenderUello {

    @PostMapping(value = "/uello", consumes = "application/json",produces = "application/json")
    OrderUelloResponse createOrder(@RequestHeader("X-API-KEY") String apiKey, @RequestBody OrderUello order);
}
